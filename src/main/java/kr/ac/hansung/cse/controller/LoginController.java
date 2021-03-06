package kr.ac.hansung.cse.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value = "/login")
	public String login(@RequestParam(value="error", required=false) String error,
			@RequestParam(value="logout", required=false) String logout, Model model) {
		
		if(error != null) {
			model.addAttribute("errorMsg", "Invalid username and password");
		}
		
		if(logout != null) {
			model.addAttribute("logoutMsg", "you have been logged out successfully");
		}
		return "login";
	}
	
}
