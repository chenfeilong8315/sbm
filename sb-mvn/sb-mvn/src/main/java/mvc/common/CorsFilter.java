package mvc.common;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

//Access-Control-Allow-Origin：允许访问的客户端域名，例如：http://web.xxx.com，若为*，则表示从任意域都能访问，即不做任何限制。
//Access-Control-Allow-Methods：允许访问的方法名，多个方法名用逗号分割，例如：GET,POST,PUT,DELETE,OPTIONS。
//Access-Control-Allow-Credentials：是否允许请求带有验证信息，若要获取客户端域下的cookie时，需要将其设置为true。
//Access-Control-Allow-Headers：允许服务端访问的客户端请求头，多个请求头用逗号分割，例如：Content-Type。
//Access-Control-Expose-Headers：允许客户端访问的服务端响应头，多个响应头用逗号分割。
/**
 * 拦截器拦截http请求 配置headers
 * 实现 CORS跨域资源共享
 * @author UC227917
 *
 */
@WebFilter(urlPatterns = "/*", filterName = "corsFilter",initParams={
		@WebInitParam(name="corsFilter",value="mvc.common.CorsFileter"),
		@WebInitParam(name="allowOrigin",value="*"),
		@WebInitParam(name="allowMethods",value="GET,POST,PUT,DELETE,OPTIONS"),
		@WebInitParam(name="allowCredentials",value="true"),
		@WebInitParam(name="allowHeaders",value="Content-Type")//X-Token
})
public class CorsFilter implements Filter {  
	Logger log = Logger.getLogger(CorsFilter.class);
    private String allowOrigin;  
    private String allowMethods;  
    private String allowCredentials;  
    private String allowHeaders;  
    private String exposeHeaders;  
  
    @Override  
    public void init(FilterConfig filterConfig) throws ServletException {  
    	 log.info("Filter init");
        allowOrigin = filterConfig.getInitParameter("allowOrigin");  
        allowMethods = filterConfig.getInitParameter("allowMethods");  
        allowCredentials = filterConfig.getInitParameter("allowCredentials");  
        allowHeaders = filterConfig.getInitParameter("allowHeaders");  
        exposeHeaders = filterConfig.getInitParameter("exposeHeaders");    
    }  
  
    /**
     * Access-Control-Allow-Origin：允许访问的客户端域名，例如：http://web.xxx.com，若为*，则表示从任意域都能访问，即不做任何限制。
Access-Control-Allow-Methods：允许访问的方法名，多个方法名用逗号分割，例如：GET,POST,PUT,DELETE,OPTIONS。
Access-Control-Allow-Credentials：是否允许请求带有验证信息，若要获取客户端域下的cookie时，需要将其设置为true。
Access-Control-Allow-Headers：允许服务端访问的客户端请求头，多个请求头用逗号分割，例如：Content-Type。
Access-Control-Expose-Headers：允许客户端访问的服务端响应头，多个响应头用逗号分割。
     * @param req
     * @param res
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override  
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {  
    	log.info("Filter doFilter");
        HttpServletRequest request = (HttpServletRequest) req;  
        HttpServletResponse response = (HttpServletResponse) res;  
        String currentOrigin = request.getHeader("Origin"); 
        if (StringUtils.isNotEmpty(allowOrigin)) { 
        	if(allowOrigin.split(",").length<2 && allowOrigin.equals("*")){
        		response.setHeader("Access-Control-Allow-Origin", currentOrigin);
        	}else{
        		 List<String> allowOriginList = Arrays.asList(allowOrigin.split(","));  
                 if (CollectionUtils.isNotEmpty(allowOriginList)) {  
                      
                     if (allowOriginList.contains(currentOrigin)) {  
                         response.setHeader("Access-Control-Allow-Origin", currentOrigin);  
                     }  
                 }  
        	}
           
        }    
        if (StringUtils.isNotEmpty(allowMethods)) {  
            response.setHeader("Access-Control-Allow-Methods", allowMethods);  
        }  
        if (StringUtils.isNotEmpty(allowCredentials)) {  
            response.setHeader("Access-Control-Allow-Credentials", allowCredentials);  
        }  
        if (StringUtils.isNotEmpty(allowHeaders)) {  
            response.setHeader("Access-Control-Allow-Headers", allowHeaders);  
        }  
        if (StringUtils.isNotEmpty(exposeHeaders)) {
            response.setHeader("Access-Control-Expose-Headers", exposeHeaders);  
        }  
        chain.doFilter(req, res);  
    }

	@Override
	public void destroy() {
		log.info("Filter destory");
	}  
  
   
}  
