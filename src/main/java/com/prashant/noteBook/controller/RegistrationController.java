package com.prashant.noteBook.controller;

import java.awt.PageAttributes.MediaType;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prashant.noteBook.repository.RegistrationUser;
import com.prashant.noteBook.repository.User;
import com.prashant.noteBook.repository.UserRepository;

@Controller
public class RegistrationController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/registration")
	public String registration(RegistrationUser data)
	{
		return "registration";
	}
	
	@RequestMapping(value  = "/createUser", method = RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String create(RegistrationUser data){
        String name = data.getName();
        String email = data.getEmail();
        String password = data.getPassword();
        String security_question = data.getSecurity_question();
        String security_answer = data.getSecurity_answer();
        if(name == "" || email == "" || password == "" || security_question == "" || security_answer == "")
        {
        	System.out.println("null entry");
        }
        else if(userRepository.findByEmail(email).isEmpty())
        	userRepository.save(new User(name,email,password,security_question,security_answer));
        else
        	System.out.println("Duplicate user");
        return "redirect:/home";
    }
}
