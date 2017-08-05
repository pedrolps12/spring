package project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import project.constant.VIEW;
import project.service.UserService;
import project.model.User;


@Controller
public class LoginController {
	
	@Autowired
    private UserService userService;
	
	@GetMapping("/")
	public String init(HttpServletRequest request){
		String view_initial="home";
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String role = auth.getAuthorities().toString();
		if (request.getUserPrincipal() != null){
			view_initial = (role.contains("ADMIN")) ? "admin/home" : "home";
		}
		return "redirect:/"+view_initial;		
	}
	@GetMapping("/admin")
	public String reHome(){
		return "redirect:/"+VIEW.admin_form;
	}
	
	@GetMapping("/admin/home")
	public String home(){		
		return VIEW.admin_form;		
	}
    
	@GetMapping("/login")
	public String showLogin(){
		return VIEW.login_form;
	}
	@GetMapping("/registro")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return VIEW.register_form;
    }	
	@PostMapping("/registro")
	public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		User userExists = userService.findUserByEmail(user.getEmail());
		if (userExists != null) {
			bindingResult
					.rejectValue("email", "error.user","There is already a user registered with the email provided");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName(VIEW.register_form);
		} else {
			userService.saveUser(user);
			modelAndView.addObject("successMessage", "User has been registered successfully");
			modelAndView.addObject("user", new User());
			modelAndView.setViewName(VIEW.login_form);			
		}
		return modelAndView;
	}
	
	
}
