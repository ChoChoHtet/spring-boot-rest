package com.example.springbootrestcrud.exception;

public class StudentErrorException extends RuntimeException {
    public StudentErrorException(String message) {
        super(message);
    }

    public StudentErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentErrorException(Throwable cause) {
        super(cause);
    }
}
