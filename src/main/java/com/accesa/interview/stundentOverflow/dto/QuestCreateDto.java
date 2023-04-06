package com.accesa.interview.stundentOverflow.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestCreateDto {
    @NotNull(message = "Every quest must have a token value !")
    private Integer questValue;
    @NotBlank(message = "Insert your description for your quest , to let other users to be able to help you !")
    private String description;


    public QuestCreateDto(Integer questValue, String description) {
        this.questValue = questValue;
        this.description = description;

    }
}
