package project.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import project.model.Category;
import project.repository.CategoryRepository;

@RestController
public class CategoryRestController {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@GetMapping("/admin/category/table")
	@JsonView(DataTablesOutput.View.class)
	public DataTablesOutput<Category> getAll(@Valid DataTablesInput input){
		return categoryRepository.findAll(input);
	}
}
