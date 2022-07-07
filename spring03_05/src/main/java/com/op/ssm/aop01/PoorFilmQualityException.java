package com.op.ssm.aop01;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop01.PoorFilmQualityException
 * @Author : cjgong
 * @Time : 2022/6/4 16:15
 * @desc :
 */

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
