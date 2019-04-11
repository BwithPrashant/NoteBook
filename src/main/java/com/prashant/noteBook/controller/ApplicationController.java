package com.prashant.noteBook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prashant.noteBook.repository.User;

@Controller
public class ApplicationController {

	@GetMapping({"/","home"})
	public String welcome()
	{
		return "welcome";
	}
	
	@RequestMapping(value = "/adduser",method=RequestMethod.POST)
	public void saveUser(User user){
     System.out.println(user.toString());
  }
}
