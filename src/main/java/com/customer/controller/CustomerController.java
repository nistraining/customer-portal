package com.customer.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("Calling home controller");
		model.addAttribute("name", "Nisith Panda");
		
		List<String> items = new ArrayList<String>();
		items.add("Tea");
		items.add("Sugar");
		items.add("Biscuits");
		model.addAttribute("i", items);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("In the About Page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("In the help page");
		
		//Creating model and view obj
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","Nisith");
		
		LocalDateTime now = LocalDateTime.now();
		mv.addObject("time",now);
		mv.setViewName("help");
		return mv;
	}

}
