package com.healthmanagement.healthtab.controller;

import com.healthmanagement.healthtab.model.Category;
import com.healthmanagement.healthtab.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

/*  we use field injection instead of this
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
*/

    @GetMapping("api/public/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }
    @PostMapping("api/public/categories")
    public String createCategory(@RequestBody Category category){
        categoryService.createCategory(category);
        return "category added";
    }
}
