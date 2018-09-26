package com.hulu73.java.io.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Auther: liuzhg
 * @Date: 2018/9/26 0026
 * @Description:
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("F:/test.txt");
        byte[] len = new byte[1024];
        StringBuffer stringBuffer = new StringBuffer("");
        while(fileInputStream.read(len) != -1){
            stringBuffer.append(new String(len));
        }
        System.out.println(stringBuffer.toString());
    }
}
