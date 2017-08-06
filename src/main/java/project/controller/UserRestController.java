package project.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import project.model.User;
import project.repository.UserRepository;

@RestController
public class UserRestController {
	
	@Autowired
	UserRepository userRepository;
	
	@JsonView(DataTablesOutput.View.class)
	@PostMapping("/admin/user/table")
	public DataTablesOutput<User> getAllCategory(@Valid @RequestBody DataTablesInput input){
		return userRepository.findAll(input);
	}
}
