package com.zryx.yygh.hosp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.zryx.yygh.hosp.mapper")
@ComponentScan(basePackages = "com.zryx")
public class HospitalSetConfig {
}
