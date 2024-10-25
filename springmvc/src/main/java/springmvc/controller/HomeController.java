package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("This is home url");
		model.addAttribute("name","Suraj Kumar");
		model.addAttribute("id",726);
	  List<String> list=new ArrayList<String>();
	  list.add("Swayam");
	  list.add("Sabya");
	  list.add("rahul");
	  list.add("suraj");
	  model.addAttribute("relate",list);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is about controller");
		return "about";
	}
	
	
	// This is ModelAndView controller
	
	@RequestMapping("/help")
	public ModelAndView help(ModelAndView model)
	{
		System.out.println("This is help controller");
		//creating model and view object
		ModelAndView mav=new ModelAndView();
		//setting the data
		mav.addObject("name","suraj");
		mav.addObject("roll",54);
		LocalDateTime now=LocalDateTime.now();
		mav.addObject("time", now);
		
		
		//marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(65);
		
		list.add(90);
		list.add(67);
		
		mav.addObject("marks",list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//setting the view name
		mav.setViewName("help");
		return mav;
	}

}
