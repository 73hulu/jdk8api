package com.hulu73.java.io.input;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @Auther: liuzhg
 * @Date: 2018/9/13 0013
 * @Description:
 */
public class ByteArrayInputStreamTest {

    public static void main(String[] args) throws IOException {
        String msg = "hello world";
        byte[] lean = new byte[msg.getBytes().length];
        lean[0]='A';
        lean[1]='B';
        lean[2]='C';
        lean[3]='D';
        //此处的参数应该是输入流内容的字节数组？？？
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(lean);
        System.out.println(msg.getBytes().length + "-------" + lean.length);
        byteArrayInputStream.close();


        int read =  byteArrayInputStream.read();
        System.out.println("read====" + lean.toString());


        while (byteArrayInputStream.read(lean)!=-1);
        byteArrayInputStream.close();
        System.out.println(new String(lean));
    }

}
