/**
 * 
 */
package com.likki.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author kks10 - Kiran Sivakoti
 *
 */
@Controller
@RequestMapping("/lbm/")
public class LoginController {

	@RequestMapping("loginPage")
	ModelAndView loginPage()
	{
		
		ModelAndView loginModelAndView = new ModelAndView();
		
		loginModelAndView.setViewName("login");
		
		return loginModelAndView;
		
	}
}
