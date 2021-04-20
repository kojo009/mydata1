package com.kojo.springbootdemo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Entity
@Data
public class Employees {

    private Integer worker_id;

    public void setWorker_id(Integer worker_id) {
        this.worker_id = worker_id;
    }

    @Id
    public Integer getWorker_id() {
        return worker_id;
    }
    private String name;
    private String gender;
    private Date birthday;
    private String phone_number;
    private String nation;
    private String job;
    private Date entry_date;
    private String status;
    private float basic_salary;
    private Integer department_id;
}
