package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.Role;
import com.op.ssm.mybatis.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.management.relation.RoleList;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationcontext-mapper.xml"})
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void textMethod01(){
        User user = userMapper.selectTable01(1);
        System.out.println("用户信息为：");
        System.out.println(user.getUser_id()+":"+user.getUser_name());
        List<Role> roleList = user.getRoleList();
        System.out.println("角色信息为：");
        for(Role role: roleList){
            System.out.println(role.getRole_name());
        }

    }

}
