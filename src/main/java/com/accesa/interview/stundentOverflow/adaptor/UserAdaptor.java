package com.accesa.interview.stundentOverflow.adaptor;

import com.accesa.interview.stundentOverflow.dto.UserCreateDto;
import com.accesa.interview.stundentOverflow.dto.UserInfoDto;
import com.accesa.interview.stundentOverflow.entity.UserEntity;

public class UserAdaptor {
    public static UserEntity convertToUserEntity(UserCreateDto userCreateDto){

        UserEntity user=new UserEntity();
        user.setUsername(userCreateDto.getUsername());
        user.setEmail(userCreateDto.getEmail());

        return user;
    }

    public static UserInfoDto convertToUserInfoDto(UserEntity userEntity){

        UserInfoDto userInfoDto=new UserInfoDto();
        userInfoDto.setUserId(userEntity.getUserId());
        userInfoDto.setUsername(userEntity.getUsername());
        userInfoDto.setEmail(userEntity.getEmail());

        return userInfoDto;
    }
}
