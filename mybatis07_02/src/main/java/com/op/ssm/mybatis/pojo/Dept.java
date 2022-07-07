package com.op.ssm.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @version : 1.0
 * @File : com.op.ssm.mybatis.pojo.Dept
 * @Author : cjgong
 * @Time : 2022/6/12 14:51
 * @desc :
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Dept implements Serializable {
    private int id;
    private String name;
}
