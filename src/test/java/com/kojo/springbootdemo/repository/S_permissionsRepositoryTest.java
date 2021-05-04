package com.kojo.springbootdemo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class S_permissionsRepositoryTest {
    @Autowired
    private S_permissionsRepository s_permissionsRepository;
    @Test
    public void findAll()
    {
        System.out.println(s_permissionsRepository.getid());
    }
}