package project.repository;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

import project.model.User;

@Repository("userRepository")
public interface UserRepository extends DataTablesRepository<User, Integer> {	
	public abstract User findByEmail(String username);
	public abstract User findById(int id);
	
}

