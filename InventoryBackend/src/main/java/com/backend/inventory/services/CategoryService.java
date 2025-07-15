package com.backend.inventory.services;


import com.backend.inventory.dtos.CategoryDTO;
import com.backend.inventory.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}