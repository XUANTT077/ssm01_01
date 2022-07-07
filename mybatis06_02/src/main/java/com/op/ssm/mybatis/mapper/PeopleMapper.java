package com.op.ssm.mybatis.mapper;

import com.op.ssm.mybatis.pojo.People;

public interface PeopleMapper {
    //查询人，并且把身份证查询出来
    People selectTable01(int people_id);
}
