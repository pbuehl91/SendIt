/**
 * 
 */
package org.send.it.json.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author buehl
 *
 */
public class EmailRequestModel 
{
	@JsonProperty("recipients")
	private List<String> recipients;
	
	@JsonProperty("ccRecipients")
	private List<String> ccRecipients;
	
	@JsonProperty("bccRecipients")
	private List<String> bccRecipients;
	
	@JsonProperty("subject")
	private String subject;
	
	@JsonProperty("message")
	private String message;

	@JsonProperty("recipients")
	public List<String> getRecipients() {
		return recipients;
	}

	@JsonProperty("recipients")
	public void setRecipients(List<String> recipients) {
		this.recipients = recipients;
	}

	@JsonProperty("ccRecipients")
	public List<String> getCcRecipients() {
		return ccRecipients;
	}

	@JsonProperty("ccRecipients")
	public void setCcRecipients(List<String> ccRecipients) {
		this.ccRecipients = ccRecipients;
	}

	@JsonProperty("bccRecipients")
	public List<String> getBccRecipients() {
		return bccRecipients;
	}

	@JsonProperty("bccRecipients")
	public void setBccRecipients(List<String> bccRecipients) {
		this.bccRecipients = bccRecipients;
	}

	@JsonProperty("subject")
	public String getSubject() {
		return subject;
	}

	@JsonProperty("subject")
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	@JsonProperty("message")
	public void setMessage(String message) {
		this.message = message;
	}
}
