package mvc.common;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang.StringUtils;
/**
 * rest 安全性 token管理类
 * @author UC227917
 *
 */
public class DefaultTokenManager implements TokenManager {  
	  
    private static Map<String, String> tokenMap = new ConcurrentHashMap<>();  
  
    @Override  
    public String createToken(String username) {  
        UUID token =  UUID.randomUUID();  
        tokenMap.put(token.toString(), username);  
        return token.toString();  
    }  
  
    @Override  
    public boolean checkToken(String token) {  
        return !StringUtils.isEmpty(token) && tokenMap.containsKey(token);  
    }  
}  
