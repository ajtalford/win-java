package com.company.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {


@Autowired
private UserRepository userRepository;
@GetMapping(value= "/")
public String index(User user) {
	return "user/index";
}


@SuppressWarnings("unused")
private User user;
@PostMapping(value = "/")
public String addNewUser(User user, Model model) {
	userRepository.save(new User(user.getFirstName(), 
        user.getLastName(), user.getEmail(), user.getSignedUp()));
	model.addAttribute("firstName", user.getFirstName());
	model.addAttribute("lastName", user.getLastName());
	model.addAttribute("userName", user.getEmail());
	model.addAttribute("SignedUp", user.getSignedUp());
	return "user/result";
}


}