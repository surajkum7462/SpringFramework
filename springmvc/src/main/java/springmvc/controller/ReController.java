package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
//	@RequestMapping("/one")
//	public String one()
//	{
//		System.out.println("This is one handler");
//		return "redirect:/enjoy";
//	}
	
	// Another method for redirect
	@RequestMapping("/one")
	public RedirectView one()
	{
		System.out.println("This is one handler");
		RedirectView rdv=new RedirectView();
		rdv.setUrl("enjoy");
		// we can add another url
		//rdv.setUrl("http://www.google.com");
		return rdv;
	}
	
	
	@RequestMapping("/enjoy")
	public String two()
	{
		System.out.println("This is second handler[enjoy");
		return "";
	}
	

}
