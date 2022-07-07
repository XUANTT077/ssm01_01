package com.op.ssm.aop01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationcontext-02.xml")
public class Aop02Test {
    @Autowired
    @Qualifier("movie")
    private Movie movie;

    @Test
    public void textMethod01() throws PoorFilmQualityException, EnvironmentDifferenceException {
        movie.filmRelease();
    }
}