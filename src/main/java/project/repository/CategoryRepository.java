package project.repository;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

import project.model.Category;

@Repository("categoryRepository")
public interface CategoryRepository extends DataTablesRepository<Category, Integer> {
	public abstract Category findById(int id);	
}
