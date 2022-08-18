package com.example.demo.entities;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component

public class Response<T> {
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public  String status;
    public String message;
    public T data;
}
