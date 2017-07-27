/**
 * 
 */
package org.send.it.rest.controller;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.send.it.rest.constant.RestConstants;
import org.send.it.service.SendItService;
import org.send.it.service.impl.SendItServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author buehl
 *
 */
@RestController
public class EmailController 
{
	@RequestMapping(value = RestConstants.BASE_URL + RestConstants.TEST, method = RequestMethod.GET)
    public ResponseEntity<String> sendEmail()
	{
		//TODO Make bean configuration
		SendItService service = new SendItServiceImpl();
		String[] to = {"britlink99@gmail.com"};
		
		try
		{
			service.sendEmail(to, "patrick.buehl91@gmail.com", "babasdkofja!", "Hecarim", "Hecarim passive");
		}
		catch(AddressException ae)
		{
			return new ResponseEntity<String>(ae.getMessage(), HttpStatus.BAD_REQUEST);
		}
		catch(MessagingException me)
		{
			return new ResponseEntity<String>(me.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<String>("Sent email", HttpStatus.CREATED);
	}
}
