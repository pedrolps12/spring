package project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.model.Category;
import project.repository.CategoryRepository;
import project.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
    private CategoryRepository categoryRepository;

	@Override
	public Category findCategoryById(int id) {
		return categoryRepository.findById(id);
	}

	@Override
	public void saveCategory(Category category) {
		categoryRepository.save(category);		
	}
	
	@Override
	public List<Category> listAllCategories() {
		return (List<Category>) categoryRepository.findAll();
	}

	@Override
	public void deleteCategory(int id) {
		categoryRepository.delete(id);		
	}
	
	
	
}
