package com.kojo.springbootdemo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class S_usersrepositoryTest {
    @Autowired
    private S_usersrepository s_usersrepository;

    @Test
    void getidandpassword(){
        System.out.println(s_usersrepository.findAll());
    }
}