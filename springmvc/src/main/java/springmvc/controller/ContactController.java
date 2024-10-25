package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("header","This is Registration Form");
		m.addAttribute("Desc","Fill this form");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {
		
		return "contact";
	}

	/* 1st method to get data from view using RequestParam */
	/*
	 * @RequestMapping(path="/processform",method=RequestMethod.POST) public String
	 * handleForm(
	 * 
	 * @RequestParam(name="email" ,required=true )String userEmail ,
	 * 
	 * @RequestParam("userName") String userName,
	 * 
	 * @RequestParam("password") String userPassword,Model model) {
	 * 
	 * System.out.println("User Email:"+userEmail);
	 * System.out.println("User Name:"+userName);
	 * System.out.println("User Password:"+userPassword);
	 * 
	 * 
	 * 
	 * User user =new User(); user.setEmail(userEmail); user.setUserName(userName);
	 * user.setPassword(userPassword);
	 * 
	 * System.out.println(user);
	 * 
	 * 
	 * 
	 * 
	 * model.addAttribute("email",userEmail); model.addAttribute("name",userName);
	 * model.addAttribute("password",userPassword);
	 * 
	 * 
	 * model.addAttribute("user",user);
	 * 
	 * 
	 * return "success"; }
	 */

	/* 2nd method to get data of view page using ModelAttribute */
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);
		if(user.getUserName().isEmpty())
		{
			return "redirect:/contact";
		}
		int createdUser=this.userService.createUser(user);
		model.addAttribute("msg","User created with id:"+createdUser);
		return "success";
	}

}
