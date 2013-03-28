package org.metabuild.poc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author jburbridge
 * @since 3/28/2013
 */
@Controller

public class HomeController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getHome() {
		return "home/view";
	}
}
