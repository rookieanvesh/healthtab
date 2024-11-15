package com.healthmanagement.healthtab.service;

import com.healthmanagement.healthtab.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
}
