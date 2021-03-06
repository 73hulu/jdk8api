package com.hulu73.java.io.input;



import java.io.*;

/**
 * @Auther: liuzhg
 * @Date: 2018/9/19 0019
 * @Description:DataInputStream使用FilterInputStream包含的流读取字节，并将字节转换为java的原始类型
 */
public class DataInputStreamTest {
    public  static void main(String[] args) throws IOException {


        FileInputStream fileInputStream = new FileInputStream(new File("f://test.txt"));
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        System.out.println(dataInputStream.readChar());
        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readUTF());
        dataInputStream.close();
    }
}
