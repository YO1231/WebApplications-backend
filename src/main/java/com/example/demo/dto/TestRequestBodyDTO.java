package com.example.demo.dto;

import lombok.Data;

@Data // getter setter 자동으로
public class TestRequestBodyDTO {
    private int id;
    private String message;
}
