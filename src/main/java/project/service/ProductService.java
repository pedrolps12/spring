package project.service;

import java.util.List;

import project.model.Product;

public interface ProductService {
	
	public Product findProductById(int id);
	public void saveProduct(Product product);
	
	public void deleteProduct(int id);
	public List<Product> listAllProducts();

}
