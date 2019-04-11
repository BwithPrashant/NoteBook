package com.prashant.noteBook.controller;

import java.util.List;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.prashant.noteBook.repository.*;
import com.prashant.noteBook.repository.UserRepository;

@Controller
public class LoginController {

	@Autowired
	UserRepository userRepository;
	public com.prashant.noteBook.repository.User authenticate(LoginUser data)
	{
		List<com.prashant.noteBook.repository.User> result = userRepository.findByEmailAndPassword(data.getEmail(), data.getPassword());
		if(result.isEmpty())
			return null;
		else
			return result.get(0);
	}
	@RequestMapping(value = "/loginUser",method=RequestMethod.POST)
	public ModelAndView loginUser(LoginUser data , 
			final RedirectAttributes redirectAttributes)
	{
		System.out.println(data.toString());
		String message="Sorry UserName Or Password Is Wrong";   
        ModelAndView model= new ModelAndView();
        com.prashant.noteBook.repository.User user = authenticate(data);
        if(user != null)
		{
        	System.out.println("Succesfully logged in");
			model.setViewName("redirect:/dashboard/"+user.getId());
			redirectAttributes.addFlashAttribute("error", "");
			redirectAttributes.addFlashAttribute("user", user);
			return model;
		}
		else
		{
			 System.out.println("Bad credential");
	         redirectAttributes.addFlashAttribute("error", message);
	         model.setViewName("redirect:/home");
	            return model;
		}
	//	return "redirect:/home";
	}
}
