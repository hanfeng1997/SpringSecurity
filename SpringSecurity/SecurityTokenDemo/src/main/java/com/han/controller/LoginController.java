package com.han.controller;

import com.han.entity.ResponseResult;
import com.han.entity.User;
import com.han.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody User user){
        // 登录
        ResponseResult result = loginService.login(user);
        return result;
    }

    @GetMapping("/user/logout")
    public ResponseResult logout(){
        return loginService.logout();
    }
}
