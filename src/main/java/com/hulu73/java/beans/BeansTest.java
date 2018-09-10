package com.hulu73.java.beans;

import com.hulu73.entity.UserEntity;

import java.beans.Beans;
import java.io.IOException;

/**
 * @Auther: liuzhg
 * @Date: 2018/9/10 0010
 * @Description:
 */
public class BeansTest {

    public  static  void main(String[] args) throws IOException, ClassNotFoundException {
        ClassLoader classLoader = BeansTest.class.getClassLoader();
        UserEntity userEntity = (UserEntity) Beans.instantiate(classLoader,"com.hulu73.entity.UserEntity");

        userEntity.setAge(10);
        userEntity.setName("张三");

        System.out.println("userEntity====" +  userEntity.toString());

    }
}
