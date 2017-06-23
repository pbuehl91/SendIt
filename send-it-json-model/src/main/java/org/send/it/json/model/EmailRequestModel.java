/**
 * 
 */
package org.send.it.json.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author buehl
 *
 */
public class EmailRequestModel 
{
	@JsonProperty("from")
	private String from;
	
	@JsonProperty("recipients")
	private Recipients recipients;
	
	@JsonProperty("subject")
	private String subject;
	
	@JsonProperty("message")
	private String message;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	@JsonProperty("recipients")
	public Recipients getRecipients() 
	{
		return recipients;
	}

	@JsonProperty("recipients")
	public void setRecipients(Recipients recipients) 
	{
		this.recipients = recipients;
	}

	@JsonProperty("subject")
	public String getSubject() 
	{
		return subject;
	}

	@JsonProperty("subject")
	public void setSubject(String subject) 
	{
		this.subject = subject;
	}

	@JsonProperty("message")
	public String getMessage() 
	{
		return message;
	}

	@JsonProperty("message")
	public void setMessage(String message) 
	{
		this.message = message;
	}
}
