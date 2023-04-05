package com.accesa.interview.stundentOverflow.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateDto {

    @NotBlank(message = "username is a mandatory field to fill")
    private String username;
    @Email(message = "Please provide a valid email!")
    @NotBlank(message = "Email is a required field to fill")
    private String email;
    private Integer tokens;
    private Integer badges;

    public UserCreateDto(String username, String email, Integer tokens, Integer badges) {
        this.username = username;
        this.email = email;
        this.tokens = tokens;
        this.badges = badges;
    }
}
