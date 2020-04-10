package com.yc.Spring.annotationConfig;

import com.yc.Spring.beans.Bean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.yc.Spring",excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {Bean1.class})})
public class MyConfig {
    @Bean(value = "innerBean")
    public Bean1 getBean1() {
        Bean1 bean=new Bean1("111","aaaa");
        return bean;
    }

}
