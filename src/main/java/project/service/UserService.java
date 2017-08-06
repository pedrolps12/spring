package project.service;

import java.util.List;

import project.model.User;

public interface UserService {
	
	public User findUserByEmail(String username);
	public User findUserById(int id);
	public void saveUser(User user);
	public void editUser(User user);
	
	public void deleteUser(int id);
	public List<User> listAllUsers();
	
}
