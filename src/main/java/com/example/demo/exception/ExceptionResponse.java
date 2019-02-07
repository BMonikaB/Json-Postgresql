package com.example.demo.exception;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ExceptionResponse {

    private Date timeStapm;
    private String message;
    private String stackTrace;
    private String details;
}
