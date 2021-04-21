package com.kojo.springbootdemo.service;

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
    public Result getusersinfo(String useraccount, String userpassword,List<S_users>userinfo) {
        for(int i=0;i<userinfo.size();i++)
        {
            if(userinfo.get(i).getUser_account().equals(useraccount))
            {
                if(userinfo.get(i).getUser_password().equals(userpassword))
                {
                    Result res=new Result(2000,"登录成功", "000");
                    return res;
                }
                else {
                    Result res=new Result(2006,"密码不正确", "000");
                    return res;
                }
            }
        }
        Result res=new Result(2005,"账户不存在","000");
        return res;
    }
}
