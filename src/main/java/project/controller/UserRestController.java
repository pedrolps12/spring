package project.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import project.model.User;
import project.repository.UserRepository;

@RestController
public class UserRestController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/admin/user/table")
	@JsonView(DataTablesOutput.View.class)
	public DataTablesOutput<User> getAllUsers(@Valid DataTablesInput input){
		return userRepository.findAll(input);
	}
}
