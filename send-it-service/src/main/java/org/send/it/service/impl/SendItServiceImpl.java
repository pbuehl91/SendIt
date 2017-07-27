/**
 * 
 */
package org.send.it.service.impl;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.send.it.service.SendItService;
import org.send.it.service.util.EmailUtil;

/**
 * @author buehl
 *
 */
public class SendItServiceImpl implements SendItService 
{
	@Override
	public void sendEmail(String[] to, String from, String password, String subject, String text)
			throws AddressException, MessagingException {  
		
		  
		Properties properties = EmailUtil.generateSmtpProperties();
		
		//Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
		
		Authenticator auth = new Authenticator() {
			//override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("patrick.buehl91@gmail.com", "PBBlrb123!");
			}
		};
		
		Session mailSession = Session.getInstance(properties, auth);
		mailSession.setDebug(false);
		Message msg = new MimeMessage(mailSession);
		msg.setFrom(new InternetAddress(from));
		InternetAddress[] address = {new InternetAddress(to[0])};
		msg.setRecipients(Message.RecipientType.TO, address);
		msg.setText(text);
		msg.setSubject(subject);
		msg.setSentDate(new Date());
		
		Transport.send(msg);
	}

	@Override
	public void sendEmail(String[] to, String[] cc, String[] bcc, String from, String password, String subject,
			String text) throws AddressException, MessagingException {
		// TODO Auto-generated method stub
		
	}
}
