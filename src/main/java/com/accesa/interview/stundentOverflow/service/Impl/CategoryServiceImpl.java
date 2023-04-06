package com.accesa.interview.stundentOverflow.service.Impl;

import com.accesa.interview.stundentOverflow.adapter.CategoryAdapter;
import com.accesa.interview.stundentOverflow.dto.CategoryCreateDto;
import com.accesa.interview.stundentOverflow.entity.CategoryEntity;
import com.accesa.interview.stundentOverflow.repository.CategoryRepository;
import com.accesa.interview.stundentOverflow.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryEntity createCategory(CategoryCreateDto categoryCreateDto) {

        CategoryEntity categoryEntity = CategoryAdapter.convertToCategoryEntity(categoryCreateDto);
        CategoryEntity category = categoryRepository.save(categoryEntity);

        return category;
    }
}
