package com.hulu73.java.beans.beancontext;

import com.hulu73.entity.UserEntity;
import com.hulu73.java.beans.beancontext.listener.MyBeanContextMembershipListener;

import java.beans.beancontext.BeanContext;
import java.beans.beancontext.BeanContextSupport;
import java.io.IOException;

/**
 * @Auther: liuzhg
 * @Date: 2018/9/10 0010
 * @Description:
 */
public class BeanContextSupportTest {

    public static void main(String[] agrs) throws IOException, ClassNotFoundException {

        BeanContextSupport beanContextSupport = new BeanContextSupport();
        MyBeanContextMembershipListener beanContextMembershipListener = new MyBeanContextMembershipListener();
        beanContextSupport.addBeanContextMembershipListener(beanContextMembershipListener);
        Object objet = beanContextSupport.instantiateChild("com.hulu73.entity.UserEntity");
        beanContextSupport.remove(objet);
        UserEntity userEntity = (UserEntity) objet;
        userEntity.setName("bbb...");
        userEntity.setAge(20);
        System.out.println(userEntity.toString());


    }

}
