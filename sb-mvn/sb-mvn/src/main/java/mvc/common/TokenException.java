package mvc.common;

/**
 * toKen自定义异常类
 * @author UC227917
 *
 */
public class TokenException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sessage;

	public String getSessage() {
		return sessage;
	}

	public void setSessage(String sessage) {
		this.sessage = sessage;
	}

	public TokenException(String sessage) {
		super();
		this.sessage = sessage;
	}
	
	
}
