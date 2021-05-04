package com.kojo.springbootdemo.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class S_permissions {
    private Integer permission_id;
    private String  perm_desc;
    public void setPermission_id(Integer permission_id) {
        this.permission_id = permission_id;
    }

    @Id
    public Integer getPermission_id() {
        return permission_id;
    }
}
