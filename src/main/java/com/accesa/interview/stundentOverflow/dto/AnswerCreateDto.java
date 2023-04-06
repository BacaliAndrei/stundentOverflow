package com.accesa.interview.stundentOverflow.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerCreateDto {

    @NotBlank(message = "Write your answer to the question !")
    private String answerDescription;

    public AnswerCreateDto(String answerDescription) {
        this.answerDescription = answerDescription;
    }
}
