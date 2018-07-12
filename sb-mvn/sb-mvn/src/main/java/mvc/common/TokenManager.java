package mvc.common;
/**
 * rest 安全性 token管理接口
 * @author UC227917
 *
 */
public interface TokenManager {  
	  
    String createToken(String username);  
  
    boolean checkToken(String token);  
}  
