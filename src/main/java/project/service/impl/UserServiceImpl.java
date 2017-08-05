package project.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import project.service.UserService;
import project.model.Role;
import project.model.User;
import project.repository.UserRepository;
import project.repository.RoleRepository;

@Service("userService")
public class UserServiceImpl implements UserService, UserDetailsService {
	
	public static final Log LOG = LogFactory.getLog(UserServiceImpl.class);
	
	@Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
    @Override
	public void deleteUser(int id) {
    	userRepository.delete(id);
	}
	@Override
	public List<User> listAllUsers() {
		//Revisar
		return (List<User>) userRepository.findAll();
	}
    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    @Override
	public User findUserById(int id) {
    	return userRepository.findById(id);
	}
    
    @Override
	public void saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setActive(true);
		Role userRole = roleRepository.findByRole("ADMIN");
		user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
	}
    public void editUser(User user) {
    	user.setActive(true);
    	user.setEmail(user.getEmail());
    	LOG.info("USER1: " + user.getEmail());
    	Role userRole = roleRepository.findByRole("ADMIN");
		user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
    	userRepository.save(user);
	}
    
    @Override
	@Transactional
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    	project.model.User user = userRepository.findByEmail(email);		
		List<GrantedAuthority> authorities = getUserAuthority(user.getRoles());
		return buildUserForAuthenticate(user, authorities);		
	}

	private List<GrantedAuthority> getUserAuthority(Set<Role> userRoles) {
		Set<GrantedAuthority> roles = new HashSet<GrantedAuthority>();
		for (Role role : userRoles) {
			roles.add(new SimpleGrantedAuthority(role.getRole()));
		}
		List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>(roles);
		return grantedAuthorities;
	}
     
	private UserDetails buildUserForAuthenticate(User user, List<GrantedAuthority> authorities) {
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), user.isActive(), true, true, true, authorities);
	}
	

	
	
    
    
}
