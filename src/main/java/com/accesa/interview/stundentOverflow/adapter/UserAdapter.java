package com.accesa.interview.stundentOverflow.adapter;

import com.accesa.interview.stundentOverflow.dto.UserCreateDto;
import com.accesa.interview.stundentOverflow.dto.UserInfoDto;
import com.accesa.interview.stundentOverflow.entity.UserEntity;

public class UserAdapter { // TODO: Rename (never use other languages besides english)
    public static UserEntity convertToUserEntity(UserCreateDto userCreateDto) {

        UserEntity user = new UserEntity();
        user.setUserName(userCreateDto.getUserName());
        user.setEmail(userCreateDto.getEmail());

        return user;
    }

    public static UserInfoDto convertToUserInfoDto(UserEntity userEntity) {

        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setId(userEntity.getUserId());
        userInfoDto.setUserName(userEntity.getUserName());
        userInfoDto.setEmail(userEntity.getEmail());

        return userInfoDto;
    }
}
