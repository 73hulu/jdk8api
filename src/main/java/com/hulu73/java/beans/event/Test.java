package com.hulu73.java.beans.event;

/**
 * 测试类
 * @Auther: liuzhg
 * @Date: 2018/9/11 0011
 * @Description:
 */
public class Test {

    public static void main(String[] args) {

        Source source = new Source();
        source.addStateChangeListener(new MyListener());

        source.changeFlag();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

    }

}
