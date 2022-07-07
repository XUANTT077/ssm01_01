package com.op.ssm.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class People {
    private int people_id;
    private String people_name;
    private IdCard idCard;
}
