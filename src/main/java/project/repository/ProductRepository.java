package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.model.Product;

@Repository("productoRepository")
public interface ProductRepository extends JpaRepository<Product, Integer> {
		
	public abstract Product findByName(String name);

}
