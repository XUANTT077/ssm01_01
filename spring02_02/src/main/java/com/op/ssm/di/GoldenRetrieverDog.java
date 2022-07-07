package com.op.ssm.di;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @version : 1.0
 * @File : com.op.ssm.di.GoldenRetrieverDog
 * @Author : cjgong
 * @Time : 2022/5/29 14:22
 * @desc :
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component("goldenRetrieverDog01")
public class GoldenRetrieverDog extends Dog{
    @Value("金色")
    private String color;
}
