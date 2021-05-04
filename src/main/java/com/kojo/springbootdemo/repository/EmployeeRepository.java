package com.kojo.springbootdemo.repository;

import com.kojo.springbootdemo.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employees,Integer> {
    @Query(value = "select * from employees where status='在职' and department_id=?1",nativeQuery = true)
    List<Employees>searchfordepartmentbyid(int department_id);
}
