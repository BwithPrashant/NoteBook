package com.prashant.noteBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prashant.noteBook.repository.User;
import com.prashant.noteBook.repository.UserRepository;

@Controller
public class DashboardController {

	@Autowired
	UserRepository userRepository;
	@RequestMapping("/dashboard/{id}")
	public String dashboard(@PathVariable String id)
	{
		return "dashboard";
	}
	
	@RequestMapping("/dashboard/{id}/notes")
	public String displayNotes(@PathVariable String id)
	{
		User user = userRepository.findById(id).get(0);
		String str = "Hello displayNotes";
		
		return "dashboard";
	}
}
