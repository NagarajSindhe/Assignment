package com.java2novice.restful;

public class ServiceResponse {

	private String messageId;
	private String messageName;
	private String errorCode;
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessageName() {
		return messageName;
	}
	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	@Override
	public String toString() {
		return "ServiceResponse [messageId=" + messageId + ", messageName=" + messageName + ", errorCode=" + errorCode
				+ "]";
	}

	
}
