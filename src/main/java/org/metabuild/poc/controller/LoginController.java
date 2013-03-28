package org.metabuild.poc.controller;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Login controller
 * 
 * @author jburbridge
 * @since 3/28/2013
 */
@Controller
public class LoginController {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	private static final String LOGIN_VIEW = "login/form";

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginForm(Model model) {
		LOGGER.debug("User not authenticated - presenting login form");
		return LOGIN_VIEW;
	}
	
	@RequestMapping(value="/loginfailed", method=RequestMethod.GET)
	public String getLoginFailed(Model model) {
		LOGGER.warn("Login failed");
		model.addAttribute("error", "true");
		return LOGIN_VIEW;
	}

	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String getLogoutForm(Model model, HttpServletRequest request) {
		LOGGER.debug("Logging out user");
		model.addAttribute("logout", "true");
		return LOGIN_VIEW;
	}
}
