package com.kojo.springbootdemo.controller;

import com.auth0.jwt.JWT;
import com.kojo.springbootdemo.entity.*;
import com.kojo.springbootdemo.repository.EmployeeRepository;
import com.kojo.springbootdemo.repository.S_permissionsRepository;
import com.kojo.springbootdemo.repository.S_usersrepository;
import com.kojo.springbootdemo.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
public class EmployeeHandler {
    @Autowired
    private S_usersrepository s_usersrepository;
    @Autowired
    private ILoginService iLoginService;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private S_permissionsRepository s_permissionsRepository;
    public List<S_users> getUserinfo(){
        return s_usersrepository.findAll();
    }
    @GetMapping("/api/findAllEmployees")
    @CrossOrigin
    public List<Employees> findAll()
    {
        return employeeRepository.findAll();
    }
    @PostMapping("/api/login")
    @CrossOrigin
    @ResponseBody
    public Result login(@RequestBody LoginForm loginForm){
        return iLoginService.getUsersInfo(loginForm,getUserinfo());
    }
    @PostMapping("api/getPermissionsList")
    @CrossOrigin
    public List<Integer> getPermissionsList()
    {
        return s_permissionsRepository.getid();
    }
}
