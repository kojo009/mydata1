package com.kojo.springbootdemo.controller;

import com.kojo.springbootdemo.entity.Employees;
import com.kojo.springbootdemo.entity.S_users;
import com.kojo.springbootdemo.repository.EmployeeRepository;
import com.kojo.springbootdemo.repository.S_usersrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/s-users")
public class EmployeeHandler {
    @Autowired
    private S_usersrepository s_usersrepository;
    @GetMapping("/findAll")
    @CrossOrigin
    public List<S_users> findAll(){
        return s_usersrepository.findAll();
    }
}
