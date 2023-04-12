package com.accesa.interview.stundentOverflow.controller;


import com.accesa.interview.stundentOverflow.dto.CategoryCreateDto;
import com.accesa.interview.stundentOverflow.entity.CategoryEntity;
import com.accesa.interview.stundentOverflow.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ControllerAdvice
@RequestMapping("/api/v1/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/create")
    public ResponseEntity<CategoryEntity> createCategory(@RequestBody @Valid CategoryCreateDto categoryCreateDto) {

        CategoryEntity category = categoryService.createCategory(categoryCreateDto);

        return ResponseEntity.ok(category);
    }

}
