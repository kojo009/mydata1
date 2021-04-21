package com.kojo.springbootdemo.entity;

import org.hibernate.mapping.Any;

public class Result{
    private int code;
    private String message;
    private String data;
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public Result(int code,String message,String data) {
        this.code = code;
        this.message=message;
        this.data=data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
