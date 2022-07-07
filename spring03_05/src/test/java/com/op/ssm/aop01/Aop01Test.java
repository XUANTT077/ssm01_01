package com.op.ssm.aop01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @version : 1.0
 * @File : com.op.ssm.aop01.Aop01Test
 * @Author : cjgong
 * @Time : 2022/6/4 16:32
 * @desc :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationcontext-01.xml")
public class Aop01Test {
    @Autowired
    @Qualifier("movie")
    private Movie movie;

    @Test
    public void testMethod01() throws PoorFilmQualityException, EnvironmentDifferenceException {
        movie.filmRelease();
    }

}