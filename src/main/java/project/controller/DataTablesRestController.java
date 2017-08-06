package project.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import project.model.Category;
import project.model.Product;
import project.model.User;
import project.repository.CategoryRepository;
import project.repository.UserRepository;
import project.repository.ProductRepository;;

@RestController
public class DataTablesRestController {
	
	@Autowired
	UserRepository userRepository;	
	@JsonView(DataTablesOutput.View.class)
	@PostMapping("/admin/user/table")
	public DataTablesOutput<User> getAllUser(@Valid @RequestBody DataTablesInput input){
		return userRepository.findAll(input);
	}
	
	@Autowired
	private CategoryRepository categoryRepository;	
	@JsonView(DataTablesOutput.View.class)
	@GetMapping("/admin/category/table")	
	public DataTablesOutput<Category> getAllCategory(@Valid DataTablesInput input){
		return categoryRepository.findAll(input);
	}
	
	@Autowired
	private ProductRepository productRepository;	
	@JsonView(DataTablesOutput.View.class)
	@GetMapping("/admin/product/table")	
	public DataTablesOutput<Product> getAllProduct(@Valid DataTablesInput input){
		return productRepository.findAll(input);
	}
}
