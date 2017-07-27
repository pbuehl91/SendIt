/**
 * 
 */
package org.send.it.service.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * @author buehl
 *
 */
public class EmailUtil 
{
	public static Properties generateSmtpProperties()
	{
		Properties properties = System.getProperties();  
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.required", "true");
		
		return properties;
	}
	
	public static Authenticator authenticate(String user, String password)
	{
		return new Authenticator() {
			//override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		};
	}
}
