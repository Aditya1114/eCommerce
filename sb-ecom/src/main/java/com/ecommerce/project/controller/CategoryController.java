package com.ecommerce.project.controller;

import com.ecommerce.project.SbEcomApplication;
import com.ecommerce.project.model.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RequestMapping("/api/public/categories")
@RestController
public class CategoryController {
    private List<Category> categories = new ArrayList<>();

    @GetMapping
    public List<Category> getAllCategories(){
        return categories;
    }
    @PostMapping
    public String createCategory(@RequestBody Category category){
        categories.add(category);
        return "Category added Successfully";

    }

}
