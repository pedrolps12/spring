package project.repository;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

import project.model.Product;

@Repository("productRepository")
public interface ProductRepository extends DataTablesRepository<Product, Integer> {		
	public abstract Product findById(int id);
}
