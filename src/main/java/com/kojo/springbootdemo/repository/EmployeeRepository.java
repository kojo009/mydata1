package com.kojo.springbootdemo.repository;

import com.kojo.springbootdemo.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees,Integer> {
}
