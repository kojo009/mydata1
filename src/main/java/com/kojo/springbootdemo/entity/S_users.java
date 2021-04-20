package com.kojo.springbootdemo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class S_users {
    private Integer user_id;
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
    @Id
    public Integer getUser_id() {
        return user_id;
    }
    private String user_account;
    private String user_password;
    private String user_name;
    private Integer role_id;
}
