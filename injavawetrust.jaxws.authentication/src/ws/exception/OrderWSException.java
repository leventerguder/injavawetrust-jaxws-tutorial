package ws.exception;

public class OrderWSException extends Exception {

	private String errorCode;
	private String errorDesc;

	public OrderWSException(String errorCode) {
		super();
		this.errorCode = errorCode;
	}

	public OrderWSException(String errorCode, String errorDesc) {
		super();
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

}
