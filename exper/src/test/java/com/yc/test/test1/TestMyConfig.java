package com.yc.test.test1;

import com.yc.Spring.beans.Bean2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMyConfig {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext("com.yc.Spring.annotationConfig");
        for(String s:context.getBeanDefinitionNames()) {
            System.out.println(s);
        }
//        Bean2 bean2=context.getBean(Bean2.class);
        Bean2 bean2=(Bean2)context.getBean("bean2");
        System.out.println(bean2.getId());
    }
}
