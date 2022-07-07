package com.op.ssm.aop01;

public class EnvironmentDifferenceException extends Exception{
    public EnvironmentDifferenceException() {
    }

    public EnvironmentDifferenceException(String message) {
        super(message);
    }

    public EnvironmentDifferenceException(String message, Throwable cause) {
        super(message, cause);
    }
}
