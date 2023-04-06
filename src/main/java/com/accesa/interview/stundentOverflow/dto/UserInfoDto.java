package com.accesa.interview.stundentOverflow.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfoDto { //TODO: do we need this (can stay for now but don't forget about it, maybe can be deleted)

    private Integer Id;

    private String userName;

    private String email;

    private Integer tokens;

    private Integer badges;
}
