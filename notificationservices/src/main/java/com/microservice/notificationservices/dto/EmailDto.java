package com.microservice.notificationservices.dto;
public class EmailDto {
	private String senderMailId;
	private String recepientMailId;
	private String subject;
	private String mailBodyContent;
	
	public String getSenderMailId() {
		return senderMailId;
	}

	public void setSenderMailId(String senderMailId) {
		this.senderMailId = senderMailId;
	}

	public String getRecepientMailId() {
		return recepientMailId;
	}

	public void setRecepientMailId(String recepientMailId) {
		this.recepientMailId = recepientMailId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMailBodyContent() {
		return mailBodyContent;
	}

	public void setMailBodyContent(String mailBodyContent) {
		this.mailBodyContent = mailBodyContent;
	}

	@Override
	public String toString() {
		return "EmailDto [senderMailId=" + senderMailId + ", recepientMailId=" + recepientMailId + ", subject="
				+ subject + ", mailBodyContent=" + mailBodyContent + "]";
	}
	
}
