package com.yc.Iterator;

import java.util.ArrayList;

public class IteratorTest1 {
    public static void main(String[] args) {
        String fff = new String("fff");
        String a=new String();
        ArrayList<String> list= new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
//        不可以这样做，因为for in内部是用Iterator迭代器实现的，
//        而这里调用Arraylist的remove方法(底层是对数组进行操作)不会被迭代器iterator识别。
//        Iterator会对此行为进行校验，然后向控制台抛出异常
        for(String s:list) {
            if("aa".equals(s)) {
                list.remove("aa");
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
