package project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import project.constant.VIEW;
import project.model.Ubigeo;
import project.model.User;
import project.repository.UbigeoRepository;
import project.service.UserService;

@Controller
@RequestMapping("/admin/user")
public class UserController {
	
	public static final Log LOG = LogFactory.getLog(UserController.class);
	
	@Autowired
	UserService userService;
	
	@GetMapping("")
	public ModelAndView listUser(){
		ModelAndView mav = new ModelAndView(VIEW.user_list);
		mav.addObject("users", userService.listAllUsers());
		return mav;
	}	
	@GetMapping("/add")
	public ModelAndView addUser(){
		ModelAndView mav = new ModelAndView(VIEW.user_add);
		User user = new User();
		mav.addObject("user", user);
		return mav;
	}
	@GetMapping("/{id}")
	public ModelAndView editUser( @PathVariable int id){
		ModelAndView mav = new ModelAndView(VIEW.user_edit);
		mav.addObject("user", userService.findUserById(id));
		return mav;
	}
	
	@Autowired
	UbigeoRepository ubigeoRepository;
	
	@ModelAttribute("departamentos")
	public List<Ubigeo> populateDepartamentos(){
		List<Ubigeo> ubigeo = ubigeoRepository.findDepartamento();
		return ubigeo;
	}
	
	@PostMapping("/")
	public String saveUser(@ModelAttribute(name = "user") User user){		
		userService.saveUser(user);		
		return "redirect:/admin/user";		
	}
	
	@PutMapping("/{id}")
	public String updateUser(@PathVariable int id, HttpServletRequest request){		
		LOG.info("edit4User: " + request.getParameter("email"));
		User user = userService.findUserById(id);
		user.setFirstname(request.getParameter("firstname"));
		user.setLastname(request.getParameter("lastname"));
		user.setEmail(request.getParameter("email"));
		user.setUbigeo(request.getParameter("ubigeo"));
		userService.editUser(user);		
		return "redirect:/admin/user";		
	}	
	@DeleteMapping("/{id}")
	public @ResponseBody void deleteUser( @PathVariable int id ){
		userService.deleteUser(id);
		LOG.info("deleteUser");
		//return "redirect:/admin/user";
	}
	

}
