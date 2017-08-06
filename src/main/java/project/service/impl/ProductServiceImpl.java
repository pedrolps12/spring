package project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.Product;
import project.repository.ProductRepository;
import project.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
    private ProductRepository productRepository;

	@Override
	public Product findProductById(int id) {
		return productRepository.findById(id);
	}

	@Override
	public void saveProduct(Product product) {
		productRepository.save(product);		
	}
	
	@Override
	public List<Product> listAllProducts() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public void deleteProduct(int id) {
		productRepository.delete(id);		
	}	
}
