package com.base; /**
 * Copyright (C), 2015-2019
 * FileName: bootDemoApplication
 * Author:   xue
 * Date:     2019/6/12 21:35
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 〈一句话功能简述〉<br> 
 * @author xue
 * @create 2019/6/12
 * @since 1.0.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.base.baseLine.dao ")
public class  BootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootDemoApplication.class);
    }
}
