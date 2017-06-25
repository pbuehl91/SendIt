/**
 * 
 */
package org.send.it.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.send.it.rest.constant.RestConstants;

/**
 * @author buehl
 *
 */
@RestController
public class EmailController 
{
	@RequestMapping(value = RestConstants.BASE_URL + RestConstants.TEST, method = RequestMethod.GET)
    public String test() 
	{
        return "You found me :)";
    }
}
