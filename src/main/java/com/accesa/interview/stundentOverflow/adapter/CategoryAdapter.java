package com.accesa.interview.stundentOverflow.adapter;


import com.accesa.interview.stundentOverflow.dto.CategoryCreateDto;
import com.accesa.interview.stundentOverflow.entity.CategoryEntity;

public class CategoryAdapter {

    public static CategoryEntity convertToCategoryEntity(CategoryCreateDto categoryCreateDto) {

        CategoryEntity category = new CategoryEntity();
        category.setCategoryName(categoryCreateDto.getCategoryName());

        return category;
    }
}
