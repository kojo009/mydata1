package com.kojo.springbootdemo.controller;

import com.kojo.springbootdemo.entity.LoginForm;
import com.kojo.springbootdemo.entity.Result;
import com.kojo.springbootdemo.entity.S_users;
import com.kojo.springbootdemo.repository.S_usersrepository;
import com.kojo.springbootdemo.service.ILoginService;
import com.kojo.springbootdemo.service.LoginServiceDefImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class EmployeeHandler {
    @Autowired
    private S_usersrepository s_usersrepository;
    @Autowired
    private ILoginService iLoginService;
    public List<S_users> getUserinfo(){
        return s_usersrepository.findAll();
    }
    @PostMapping("/api/login")
    @CrossOrigin
    @ResponseBody
    public Result login(@RequestBody LoginForm loginForm){
        return iLoginService.getusersinfo(loginForm.getUsername(),loginForm.getUserpassword(),getUserinfo());
    }
}
