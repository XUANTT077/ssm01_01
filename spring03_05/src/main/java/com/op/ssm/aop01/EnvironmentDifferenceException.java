package com.op.ssm.aop01;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop01.EnvironmentDifferenceException
 * @Author : cjgong
 * @Time : 2022/6/4 16:17
 * @desc :
 */

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
