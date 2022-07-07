package com.op.ssm.di;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @version : 1.0
 * @File : com.op.ssm.di.Cat
 * @Author : cjgong
 * @Time : 2022/5/29 14:30
 * @desc :
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Component("cat01")
public class Cat {
    @Value("1")
    private int id;
    @Value("cat01")
    private String name;
}
