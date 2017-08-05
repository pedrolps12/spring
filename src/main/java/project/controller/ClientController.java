package project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import project.constant.VIEW;
import project.model.User;
import project.service.UserService;

@Controller
@RequestMapping("/")
public class ClientController {
	
	
	
	@Autowired
    private UserService userService;
	
	@GetMapping("/home")
	public ModelAndView home(HttpServletRequest request){
		String userName = "";
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		ModelAndView mav = new ModelAndView(VIEW.home_form);		
		if (request.getUserPrincipal() != null){
			User user 	= userService.findUserByEmail(auth.getName());
			userName = user.getEmail();			
		}
		mav.addObject("username", userName);
		return mav;
	}
	
	@GetMapping("/contact")
	public String contact(){
		return VIEW.client_contact;
	}
	
	@GetMapping("/product")
	public String product(){
		return VIEW.client_product;
	}

}
