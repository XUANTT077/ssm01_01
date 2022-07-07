package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.People;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationcontext-mapper.xml"})
public class PeopleMapperTest {
    @Autowired
    private PeopleMapper peopleMapper;
    @Test
    public void selectMethod01() {
        People people = peopleMapper.selectTable01(1);
        System.out.println("人的信息为：");
        System.out.println(people.getPeople_id()+":"+people.getPeople_name());
        System.out.println("身份证的信息为：");
        System.out.println(people.getIdCard().getIdcard_num());
    }
}
