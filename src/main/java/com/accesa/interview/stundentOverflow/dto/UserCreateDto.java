package com.accesa.interview.stundentOverflow.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateDto {

    @NotBlank(message = "username is a mandatory field to fill")
    private String userName;
    @Email(message = "Please provide a valid email!")
    @NotBlank(message = "Email is a required field to fill")
    private String email;
    private Integer tokens;
    private Integer badges;

    public UserCreateDto(String userName, String email, Integer tokens, Integer badges) {
        this.userName = userName;
        this.email = email;
        this.tokens = tokens;
        this.badges = badges;
    }
}
