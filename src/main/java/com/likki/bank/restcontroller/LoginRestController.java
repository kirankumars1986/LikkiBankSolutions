/**
 * 
 */
package com.likki.bank.restcontroller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KV
 *
 */
@RestController
public class LoginRestController {

	@GetMapping(value="/validateLogin",produces = MediaType.TEXT_PLAIN_VALUE)
	String loginRestValidation()
	{
		return "Login Validated Successfully";
	}
}
