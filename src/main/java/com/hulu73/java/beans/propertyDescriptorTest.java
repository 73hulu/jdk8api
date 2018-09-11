package com.hulu73.java.beans;

import com.hulu73.entity.UserEntity;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Auther: liuzhg
 * @Date: 2018/9/11 0011
 * @Description:
 */
public class propertyDescriptorTest {

    public static void main(String[] args) throws IntrospectionException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Object value;
        Object obj;
        //创建对象
        obj = UserEntity.class.newInstance();
        Class userEntityClass = UserEntity.class;
        PropertyDescriptor propertyDescriptor;
        propertyDescriptor = new PropertyDescriptor("age",userEntityClass);
        propertyDescriptor.getWriteMethod().invoke(obj,3);
        value = propertyDescriptor.getReadMethod().invoke(obj);
        System.out.println("age:" + value);

        propertyDescriptor = new PropertyDescriptor("name",userEntityClass);
        propertyDescriptor.getWriteMethod().invoke(obj,"王五");
        value = propertyDescriptor.getReadMethod().invoke(obj);
        System.out.println("name:" + value);

    }

}
