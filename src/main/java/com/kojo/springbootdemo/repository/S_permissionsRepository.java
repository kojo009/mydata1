package com.kojo.springbootdemo.repository;

import com.kojo.springbootdemo.entity.S_permissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface S_permissionsRepository extends JpaRepository<S_permissions,Integer> {
    @Query(value = "select permission_id from s_permissions",nativeQuery = true)
    List<Integer>getid();
}
