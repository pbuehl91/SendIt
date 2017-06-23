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
public class Recipients 
{
	@JsonProperty("to")
	private List<String> to;
	
	@JsonProperty("cc")
	private List<String> cc;
	
	@JsonProperty("bcc")
	private List<String> bcc;

	@JsonProperty("to")
	public List<String> getTo() 
	{
		return to;
	}

	@JsonProperty("to")
	public void setTo(List<String> to) 
	{
		this.to = to;
	}

	@JsonProperty("cc")
	public List<String> getCc() 
	{
		return cc;
	}

	@JsonProperty("cc")
	public void setCc(List<String> cc) 
	{
		this.cc = cc;
	}

	@JsonProperty("bcc")
	public List<String> getBcc() 
	{
		return bcc;
	}

	@JsonProperty("bcc")
	public void setBcc(List<String> bcc) 
	{
		this.bcc = bcc;
	}
}
