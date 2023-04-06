package com.accesa.interview.stundentOverflow.service.Impl;

import com.accesa.interview.stundentOverflow.adapter.UserAdapter;
import com.accesa.interview.stundentOverflow.dto.UserCreateDto;
import com.accesa.interview.stundentOverflow.dto.UserInfoDto;
import com.accesa.interview.stundentOverflow.entity.UserEntity;
import com.accesa.interview.stundentOverflow.exception.UserException;
import com.accesa.interview.stundentOverflow.repository.UserRepository;
import com.accesa.interview.stundentOverflow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserInfoDto createUser(UserCreateDto userCreateDto) {

        UserEntity user = UserAdapter.convertToUserEntity(userCreateDto);
        UserEntity response = userRepository.save(user);
        UserInfoDto userInfoDto = UserAdapter.convertToUserInfoDto(response);

        return userInfoDto;
    }

    @Override
    public UserInfoDto findUserByUserName(String username) {

        UserEntity user = userRepository.findByUserName(username).orElseThrow(() -> new UserException("User not found!"));
        return UserAdapter.convertToUserInfoDto(user);
    }

    @Override
    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public List<UserInfoDto> getAllUsers() {

        List<UserEntity> userEntityList = new ArrayList<>();
        userRepository.findAll().forEach(userEntity -> userEntityList.add(userEntity));

        List<UserInfoDto> userInfoDtoList = new ArrayList<>();
        for (UserEntity e : userEntityList) {
            userInfoDtoList.add(UserAdapter.convertToUserInfoDto(e));
        }
        return userInfoDtoList;
    }

}
