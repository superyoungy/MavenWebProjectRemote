package com.yc.test.test1;

import com.yc.Spring.beans.Bean1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    public static void main(String[] args) {
        System.out.println("主函数...");
    }
    @Test
    public void testSuperyoungyXml() {
//        ApplicationContext context=new FileSystemXmlApplicationContext("classpath:spring/ApplicationContext.xml");
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/ApplicationContext.xml");
        Bean1 bean1=(Bean1)context.getBean("superyoungy");
        System.out.println(bean1.getId());
        System.out.println("Hello Word!");
    }
}
