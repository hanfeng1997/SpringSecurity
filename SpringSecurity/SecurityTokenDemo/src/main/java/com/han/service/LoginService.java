package com.han.service;

import com.han.entity.ResponseResult;
import com.han.entity.User;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
