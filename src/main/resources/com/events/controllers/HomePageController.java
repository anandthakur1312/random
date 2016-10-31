package com.events.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController
{
	@RequestMapping("/homepage")
    public ModelAndView homePage() 
	{
		System.out.println("Hello from homepage");
        String message = "Hello World, Spring 3.0!";
       ModelAndView mv = new ModelAndView("HomePage"); 

    }

}
