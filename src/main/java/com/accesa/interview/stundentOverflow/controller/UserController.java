package com.accesa.interview.stundentOverflow.controller;

import com.accesa.interview.stundentOverflow.dto.UserCreateDto;
import com.accesa.interview.stundentOverflow.dto.UserInfoDto;
import com.accesa.interview.stundentOverflow.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ControllerAdvice
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {

        this.userService = userService;

    }

    @PostMapping("/create")
    public ResponseEntity<UserInfoDto> createUser(@RequestBody @Valid UserCreateDto userCreateDto) {

        UserInfoDto userInfoDto = userService.createUser(userCreateDto);

        return ResponseEntity.ok(userInfoDto);
    }

    @GetMapping("/findUserByUserName")
    public ResponseEntity<UserInfoDto> findUserByUserName(@RequestParam String username) {

        UserInfoDto userInfoDto = userService.findUserByUserName(username);

        return ResponseEntity.ok(userInfoDto);
    }

    @DeleteMapping("/deleteUser")
    public ResponseEntity<Void> delete(@RequestParam Integer userId){
        userService.deleteUser(userId);
        return ResponseEntity.ok().build();
    }

}
