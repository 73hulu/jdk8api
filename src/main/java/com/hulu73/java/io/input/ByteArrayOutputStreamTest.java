package com.hulu73.java.io.input;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @Auther: liuzhg
 * @Date: 2018/9/16 0016
 * @Description:
 */
public class ByteArrayOutputStreamTest {

    public static void main(String[] args) throws IOException {
        String msg = "hello world";

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(msg.getBytes());
        System.out.println(byteArrayOutputStream.toString());
    }
}
