/**
 * 
 */
package org.send.ita.service.impl;

import java.security.Security;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.send.it.service.SendItService;

/**
 * @author buehl
 *
 */
public class SendItServiceImpl implements SendItService {

	@SuppressWarnings("restriction")
	@Override
	public void sendEmail(String to, String from, String subject, String text)
			throws AddressException, MessagingException 
	{
		String host = "smtp.gmail.com";
		String user = "patrick.buehl91@gmail.com";
		String password = "PBBlrb123!";
		boolean sessionDebug = false;
	  
		Properties properties = System.getProperties();  
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.required", "true");
		  
		Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
		Session mailSession = Session.getInstance(properties, null);
		mailSession.setDebug(sessionDebug);
		Message msg = new MimeMessage(mailSession);
		msg.setFrom(new InternetAddress(from));
		InternetAddress[] address = {new InternetAddress(to)};
		msg.setRecipients(Message.RecipientType.TO, address);
		msg.setText(text);
		msg.setSubject(subject);
		msg.setSentDate(new Date());
		
		Transport transport = mailSession.getTransport("smtp");
		transport.connect(host, user, password);
		transport.sendMessage(msg, msg.getAllRecipients());
		transport.close();
		
	}

}
