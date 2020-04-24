package com.book.utilities;

/**
 * This class is used to send error information with error code and error
 * message to client.
 */
public class ErrorInfo {

	private int errorCode;

	private String errorMsg;

	/**
	 * Gets the error code.
	 *
	 * @return the error code
	 */
	public int getErrorCode() {
		return errorCode;
	}

	/**
	 * Sets the error code.
	 *
	 * @param value the new error code
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * Gets the error msg.
	 *
	 * @return the error msg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * Sets the message.
	 *
	 * @param msg the new message
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return "ErrorInfo [errorCode=" + errorCode + ", errorMsg=" + errorMsg + "]";
	}

}
