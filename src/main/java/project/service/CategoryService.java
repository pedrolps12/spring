package project.service;

import java.util.List;

import project.model.Category;

public interface CategoryService {
	
	public Category findCategoryById(int id);
	public void saveCategory(Category Category);
	
	public void deleteCategory(int id);
	public List<Category> listAllCategories();
	
}
