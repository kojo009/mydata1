package com.kojo.springbootdemo.service;

import com.kojo.springbootdemo.entity.LoginForm;
import com.kojo.springbootdemo.entity.Result;
import com.kojo.springbootdemo.entity.S_users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public interface ILoginService {
    public Result getUsersInfo(LoginForm loginForm, List<S_users> userinfo);
}
