package com.kojo.springbootdemo.service;

import com.kojo.springbootdemo.repository.S_usersrepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoginServiceDefImplTest {
    @Autowired
    private S_usersrepository s_usersrepository;
    @Autowired
    private ILoginService iLoginService;

    @Test
    public void check(){
        System.out.println(iLoginService.getusersinfo("1014595855@qq.com","123456",s_usersrepository.findAll()));
    }
}