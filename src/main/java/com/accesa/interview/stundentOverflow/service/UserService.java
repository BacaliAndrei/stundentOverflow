package com.accesa.interview.stundentOverflow.service;

import com.accesa.interview.stundentOverflow.dto.UserCreateDto;
import com.accesa.interview.stundentOverflow.dto.UserInfoDto;

import java.util.List;

public interface UserService {

    UserInfoDto createUser(UserCreateDto userCreateDto);

    UserInfoDto findUserByUserName(String userName);

    void deleteUser(Integer userId);

    List<UserInfoDto> getAllUsers();

}
