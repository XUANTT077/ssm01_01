package com.op.ssm.di;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @version : 1.0
 * @File : com.op.ssm.di.Dog
 * @Author : cjgong
 * @Time : 2022/5/29 14:16
 * @desc :
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component("dog01")
public class Dog {
    @Value("1")
    private int id;
    @Value("cjgong01")
    private String name;

}
