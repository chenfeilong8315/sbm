package mvc.common;

import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 
 * aop实现http访问的日志记录
 * 
 * 
 * @version v.0.1
 * 
 */

@Aspect
@Component
@Order(-5)
public class WebLogAspect {

	static Logger logger = Logger.getLogger(WebLogAspect.class);
	ThreadLocal<Long> startTime = new ThreadLocal<Long>();

	/**
	 * 
	 * 定义一个切入点.
	 */

	@Pointcut("execution(public * mvc.controller..*.*(..))")
	public void webLog() {
	}

	@Before("webLog()")
	public void doBefore(JoinPoint joinPoint) {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		startTime.set(System.currentTimeMillis());
		// 接收到请求，记录请求内容
		logger.info("WebLogAspect.doBefore()");

		HttpServletRequest request = attributes.getRequest();

		// 记录下请求内容

		logger.info("URL : " + request.getRequestURL().toString());

		logger.info("HTTP_METHOD : " + request.getMethod());

		logger.info("IP : " + request.getRemoteAddr());

		logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "."
				+ joinPoint.getSignature().getName());

		logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));

		// 获取所有参数方法一：

		Enumeration<String> enu = request.getParameterNames();

		while (enu.hasMoreElements()) {

			String paraName = (String) enu.nextElement();

			System.out.println(paraName + ": " + request.getParameter(paraName));

		}

	}

	@AfterReturning("webLog()")
	public void doAfterReturning(JoinPoint joinPoint) {

		// 处理完请求，返回内容

		logger.info("WebLogAspect.doAfterReturning()");

		logger.info("Request time consuming : " + (System.currentTimeMillis() - startTime.get()));

	}

}