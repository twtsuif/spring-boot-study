package com.twt.service;

import com.twt.utils.ResponseResult;
import com.twt.entity.User;

public interface LoginServcie {
    ResponseResult login(User user);

    ResponseResult logout();

}
