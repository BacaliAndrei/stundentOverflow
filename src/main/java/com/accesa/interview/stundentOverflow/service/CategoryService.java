package com.accesa.interview.stundentOverflow.service;


import com.accesa.interview.stundentOverflow.dto.CategoryCreateDto;
import com.accesa.interview.stundentOverflow.entity.CategoryEntity;

public interface CategoryService {

    CategoryEntity createCategory(CategoryCreateDto categoryCreateDto);
}
