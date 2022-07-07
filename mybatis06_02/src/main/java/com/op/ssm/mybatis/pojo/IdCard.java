package com.op.ssm.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class IdCard {
    private int idcard_id;
    private String idcard_num;
    private People people;
}
