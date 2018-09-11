package com.hulu73.java.beans.beancontext.listener;

import java.beans.beancontext.BeanContextMembershipEvent;
import java.beans.beancontext.BeanContextMembershipListener;

/**
 * @Auther: liuzhg
 * @Date: 2018/9/10 0010
 * @Description:
 */
public class MyBeanContextMembershipListener implements BeanContextMembershipListener {
    public void childrenAdded(BeanContextMembershipEvent bcme) {
        System.out.println("add Members...");
    }

    public void childrenRemoved(BeanContextMembershipEvent bcme) {
        System.out.println("remove Members...");
    }
}
