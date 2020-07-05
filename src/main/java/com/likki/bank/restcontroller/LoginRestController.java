/**
 * 
 */
package com.likki.bank.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.likki.bank.DAO.LBSRegisterUserDAO;
import com.likki.bank.domain.LBSUserDetailsDomain;
import com.likki.bank.service.LBSRegisterUserService;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;

/**
 * @author KV
 *
 */
@RestController
@Slf4j
public class LoginRestController {

	
	@Autowired
	//LBSRegisterUserService lbsRegisterUserService;
	LBSRegisterUserDAO lbsRegisterUserDAO;
	
	@GetMapping(value="/validateLogin",produces = MediaType.TEXT_PLAIN_VALUE)
	String loginRestValidation()
	{
		return "Login Validated Successfully";
	}
	
	@PostMapping(value="/insertUserDetails")
	String insertUserDetails(@RequestBody LBSUserDetailsDomain lbsUserDetailsDomain)
	{
		lbsUserDetailsDomain = lbsRegisterUserDAO.save(lbsUserDetailsDomain);
		
		return lbsUserDetailsDomain.toString();
	}
	
}
