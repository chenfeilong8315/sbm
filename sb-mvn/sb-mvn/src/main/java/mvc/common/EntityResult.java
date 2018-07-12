package mvc.common;

/**
 * 返回实体类
 * @author UC227917
 *
 */
public  class EntityResult {
	public  Integer errorCode;//0：feil 1：succes 2：notFiles
	public   String message;
	public  Object data;
	public Integer geterrorCode() {
		return errorCode;
	}
	public void seterrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((errorCode == null) ? 0 : errorCode.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntityResult other = (EntityResult) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (errorCode == null) {
			if (other.errorCode != null)
				return false;
		} else if (!errorCode.equals(other.errorCode))
			return false;
		return true;
	}
	public EntityResult(Integer errorCode, String message, Object data) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.data = data;
	}
	public EntityResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
