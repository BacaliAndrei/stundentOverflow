package com.accesa.interview.stundentOverflow.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfoDto {

    private Integer userId;

    private String username;

    private String email;

    private Integer tokens;

    private Integer badges;
}
