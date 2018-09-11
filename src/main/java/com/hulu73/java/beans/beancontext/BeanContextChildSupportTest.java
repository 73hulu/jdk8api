package com.hulu73.java.beans.beancontext;

import com.hulu73.java.beans.beancontext.listener.MyPropertyChangeListener;

import java.beans.PropertyVetoException;
import java.beans.beancontext.BeanContext;
import java.beans.beancontext.BeanContextChildSupport;
import java.beans.beancontext.BeanContextSupport;

/**
 * @Auther: liuzhg
 * @Date: 2018/9/11 0011
 * @Description:
 */
public class BeanContextChildSupportTest {

    public static void main(String[] agrs) throws PropertyVetoException {

        BeanContext beanContext = new BeanContextSupport();

        BeanContextChildSupport beanContextChildSupport = new BeanContextChildSupport();

        beanContextChildSupport.setBeanContext(beanContext);
        String name = "keyWorld";
        MyPropertyChangeListener myPropertyChangeListener = new MyPropertyChangeListener();
        beanContextChildSupport.addPropertyChangeListener(name,myPropertyChangeListener);
        System.out.println("-----------------------------");
        beanContextChildSupport.firePropertyChange(name,"张三","王五");
    }

}
