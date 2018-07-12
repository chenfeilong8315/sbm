package mvc.common;

import java.lang.reflect.Method;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 安全类
 * AOP实现  验证http访问 中的Haders中的token随机码 
 * 匹配则允许调用restful web servers api
 * @author UC227917
 *
 */
//@Aspect
//@Component
// @Order(-5)
public class SecurityAspect {
	static Logger logger = Logger.getLogger(SecurityAspect.class);
	private static final String DEFAULT_TOKEN_NAME = "X-Token";
	private TokenManager tokenManager;
	private String tokenName;

	public void setTokenManager(TokenManager tokenManager) {
		this.tokenManager = tokenManager;
	}

	public void setTokenName(String tokenName) {
		if (StringUtils.isEmpty(tokenName)) {
			tokenName = DEFAULT_TOKEN_NAME;
		} else {
			this.tokenName = tokenName;
		}

	}

	@Pointcut("execution(public * mvc.controller..*.*(..))")
	public void toKenCheck() {
	}

	@Around("toKenCheck()")
	public Object testAop(ProceedingJoinPoint pro) throws Throwable {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		// 从切点上获取目标方法
		MethodSignature methodSignature = (MethodSignature) pro.getSignature();
		Method method = methodSignature.getMethod();
		// 若目标方法忽略了安全性检查，则直接调用目标方法
		if (method.isAnnotationPresent(IgnorevSecurity.class)) {
			return pro.proceed();
		}
		// 从 request header 中获取当前 token
		setTokenName(tokenName);
		String token = attributes.getRequest().getHeader(tokenName);
		// 检查 token 有效性
		if (token == null || !tokenManager.checkToken(token)) {
			String message = String.format("token [%s] is invalid", token);
			throw new TokenException(message);
		}
		// 调用目标方法
		return pro.proceed();
	}

}
