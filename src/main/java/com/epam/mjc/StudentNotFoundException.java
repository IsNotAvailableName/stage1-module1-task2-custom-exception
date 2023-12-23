package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException{
    StudentNotFoundException(String msg, Throwable ex){
        super(msg, ex);
    }
}
