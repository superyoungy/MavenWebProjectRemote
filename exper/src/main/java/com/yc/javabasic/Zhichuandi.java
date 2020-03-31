package com.yc.javabasic;
class Student {
    int id=5;
    String s="s";
}
public class Zhichuandi {
    public static void main(String[] args) {
        Student stu1=new Student();
        Student student2=stu1;
        student2.id=6;
        student2.s="ss";
        System.out.println(stu1.id+" "+stu1.s);//stu1跟着改变

        int idd=student2.id;
        String ss=student2.s;
        idd=8;ss="newvalue";
        System.out.println(stu1.id+" "+stu1.s);
        System.out.println(student2.id+" "+student2.s);

    }
}
