/**
 * 
 */
package org.send.it.service;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

/**
 * @author buehl
 *
 */
public interface SendItService 
{
	public void sendEmail(String to, String from, String subject, String text) throws AddressException, MessagingException;
}
