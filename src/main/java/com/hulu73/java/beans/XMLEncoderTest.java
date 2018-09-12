package com.hulu73.java.beans;

import com.hulu73.entity.UserEntity;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 将对象转化为xml
 * @Auther: liuzhg
 * @Date: 2018/9/11 0011
 * @Description:
 */
public class XMLEncoderTest {

    public static void main(String[] args) throws FileNotFoundException {

        UserEntity userEntity1 = new UserEntity(10,"张三");
        UserEntity userEntity2 = new UserEntity(20,"王五");

        BufferedOutputStream out;
        out = new BufferedOutputStream(new FileOutputStream("f:/users.xml"));
        XMLEncoder xmlEncoder = new XMLEncoder(out);

        xmlEncoder.setOwner("liuzhg");

        xmlEncoder.writeObject(userEntity1);
        xmlEncoder.writeObject(userEntity2);

        Object owner =  xmlEncoder.getOwner();
        System.out.println("owner---" + owner);

        xmlEncoder.flush();
        xmlEncoder.close();
    }
}
