package project.controller;

import javax.servlet.http.HttpServletRequest;

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
import project.model.Category;
import project.service.CategoryService;

@Controller
@RequestMapping("/admin/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
		
	@GetMapping("")
	public ModelAndView listCategory(){
		ModelAndView mav = new ModelAndView(VIEW.category_list);
		mav.addObject("categories", categoryService.listAllCategories());
		return mav;
	}
	@GetMapping("/add")
	public ModelAndView addCategory(){
		ModelAndView mav = new ModelAndView(VIEW.category_add);
		Category category = new Category();
		mav.addObject("category", category);
		return mav;
	}
	@GetMapping("/{id}")
	public ModelAndView ediCategory( @PathVariable int id){
		ModelAndView mav = new ModelAndView(VIEW.category_edit);
		mav.addObject("category", categoryService.findCategoryById(id));
		return mav;
	}
	@PostMapping("/")
	public String saveCategory(@ModelAttribute(name = "category") Category category){		
		categoryService.saveCategory(category);		
		return "redirect:/admin/category";		
	}
	@PutMapping("/{id}")
	public String updateCategory(@PathVariable int id, HttpServletRequest request){		
		Category category = categoryService.findCategoryById(id);
		category.setName(request.getParameter("firstname"));
		category.setDescription(request.getParameter("lastname"));
		categoryService.saveCategory(category);		
		return "redirect:/admin/category";		
	}	
	@DeleteMapping("/{id}")
	public @ResponseBody void deleteCategory( @PathVariable int id ){
		categoryService.deleteCategory(id);
	}
}
