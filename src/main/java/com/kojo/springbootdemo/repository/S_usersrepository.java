package com.kojo.springbootdemo.repository;

import com.kojo.springbootdemo.entity.S_users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface S_usersrepository extends JpaRepository<S_users,Integer> {
}
