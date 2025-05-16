package com.hotek21.hotel_service.service;

import com.hotek21.hotel_service.model.Category;
import com.hotek21.hotel_service.model.HotelBrand;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Category createCategory(Category category);
    Optional<Category> getCategoryById(Long id);
    List<Category> getAllCategory();
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);
}
