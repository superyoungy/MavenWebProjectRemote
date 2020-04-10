package com.yc.string;

import org.apache.lucene.util.RamUsageEstimator;

public class TestNullAndNothing {
    int a;//自动赋值为0；如果是对象，自动赋值为null
//    String sss;
    public static void main(String[] args) {

//        System.out.println(RamUsageEstimator.sizeOf(new TestNullAndNothing().sss));
//        System.out.println(new TestNullAndNothing().sss);
        String s="";
        System.out.println("长度为0的字符串："+ RamUsageEstimator.sizeOf(s));//打印所占字节数
        String ss=null;
        System.out.println("字符串赋空值null："+RamUsageEstimator.sizeOf(ss));

        int b=11;//变量不初始化编译不能通过
        System.out.println("全局变量不赋值："+RamUsageEstimator.sizeOf(new TestNullAndNothing().a));
        System.out.println("变量赋初值："+RamUsageEstimator.sizeOf(b));
    }
}
