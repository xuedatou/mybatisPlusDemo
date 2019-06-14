/**
 * Copyright (C), 2015-2019
 * FileName: MybatisPlusConfig
 * Author:   xue
 * Date:     2019/6/13 9:26
 */
package com.base.baseLine.mybatisPlusConfig;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 〈一句话功能简述〉<br> 
 * @author xue
 * @create 2019/6/14
 * @since 1.0.0
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.baomidou.cloud.service.*.mapper*")
public class MybatisPlusConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
