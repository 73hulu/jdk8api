package com.hulu73.java.beans;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Auther: liuzhg
 * @Date: 2018/9/11 0011
 * @Description:
 */
public class XMLDecoderTest {

    public static void main(String[] args) throws FileNotFoundException {

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("f://users.xml"));

        XMLDecoder xmlDecoder = new XMLDecoder(bufferedInputStream);

        Object owner =  xmlDecoder.getOwner();
        System.out.println("owner---" + owner);

        Object object = xmlDecoder.readObject();
        System.out.println("object---" + object);

         object = xmlDecoder.readObject();
        System.out.println("object---" + object);
        //出现数组越界异常
        object = xmlDecoder.readObject();
        System.out.println("object---" + object);
    }
}
