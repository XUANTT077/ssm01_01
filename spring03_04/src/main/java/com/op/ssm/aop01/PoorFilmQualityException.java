package com.op.ssm.aop01;

public class PoorFilmQualityException extends Exception{
    public PoorFilmQualityException() {
    }

    public PoorFilmQualityException(String message) {
        super(message);
    }

    public PoorFilmQualityException(String message, Throwable cause) {
        super(message, cause);
    }
}
