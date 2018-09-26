package com.hulu73.java.io.input;

import java.io.*;

/**
 * @Auther: liuzhg
 * @Date: 2018/9/26 0026
 * @Description:
 */
public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File("F:/test.txt"));
        String msg = "232143213123123123123124325465768798067876";
        fileOutputStream.write(msg.getBytes());
        FileDescriptor fileDescriptor = fileOutputStream.getFD();
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileDescriptor);
        fileOutputStream2.write("hello".getBytes());
        System.out.println("end...");
    }
}
