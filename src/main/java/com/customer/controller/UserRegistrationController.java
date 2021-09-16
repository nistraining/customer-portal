package com.customer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.customer.model.User;
import com.customer.service.UserService;

@Controller
public class UserRegistrationController {
	
	@Autowired
	private UserService userService;
	@ModelAttribute
	public void commonDataModel(Model model)
	{
		System.out.println("Adding common data to model,Creating form");
		model.addAttribute("formtitle", "Customer Registration");
		model.addAttribute("formdesc","Please fill in the below details");
	}
	@RequestMapping("/register")
	public String showForm(Model model)
	{
		return "registration";
	}
	
//	@RequestMapping(path="/processForm", method = RequestMethod.POST )
//	public String handleForm(@RequestParam("email") String email, 
//			@RequestParam("username")String username, 
//			@RequestParam("password")String password, Model model)
//	{
//		
//		User user = new User();
//		user.setUsername(username);
//		user.setEmail(email);
//		user.setPassword(password);
////		
////		System.out.println("User Email is : " + email);
////		System.out.println("User Name  is : " + username);
////		System.out.println("Password is : " + password);
////		
////		model.addAttribute("name", username);
////		model.addAttribute("email",email);
////		model.addAttribute("password",password);
//		
//		model.addAttribute(user);
//		return "success";
//	}
//	
	@RequestMapping(path="/processForm", method = RequestMethod.POST )
	public String handleForm(@ModelAttribute User user, Model model)
	{
		
	    System.out.println(user);		
		return "success";
	}

}
