package com.kojo.springbootdemo.service;

import com.kojo.springbootdemo.entity.LoginForm;
import com.kojo.springbootdemo.entity.Result;
import com.kojo.springbootdemo.entity.S_users;
import com.kojo.springbootdemo.repository.S_usersrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginServiceDefImpl implements ILoginService {
    @Override
    public Result getUsersInfo(LoginForm loginForm, List<S_users>userinfo) {
        System.out.println(loginForm.getUsername());
        System.out.println(loginForm.getPassword());
        for(int i=0;i<userinfo.size();i++)
        {
            if(userinfo.get(i).getUser_account().equals(loginForm.getUsername()))
            {
                if(userinfo.get(i).getUser_password().equals(loginForm.getPassword()))
                {
                    Result res=new Result(2000,"登录成功", loginForm.getToken());
                    System.out.println(res);
                    return res;
                }
                else {
                    Result res=new Result(2006,"密码不正确", loginForm.getToken());
                    System.out.println(res);
                    return res;
                }
            }
        }
        Result res=new Result(2005,"账户不存在",loginForm.getToken());
        System.out.println(res);
        return res;
    }
}
