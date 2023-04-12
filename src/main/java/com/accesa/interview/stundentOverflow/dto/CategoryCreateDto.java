package com.accesa.interview.stundentOverflow.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryCreateDto {
    @NotBlank(message = "Each category must have a name !")
    private String categoryName;

    public CategoryCreateDto(String categoryName) {
        this.categoryName = categoryName;
    }

    public CategoryCreateDto() {
    }
}
