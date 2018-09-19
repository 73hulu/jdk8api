package com.hulu73.java.io.input;

import java.io.*;

/**
 *
 * @Auther: liuzhg
 * @Date: 2018/9/19 0019
 * @Description:DataOutputStream将字节转换为java的原始类型以及String，然后通过装饰模式，调用FilterOutputStream包含的输出流进行输出
 */
public class DataOutputStreamTest {
    public static  void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("f://test.txt");
        DataOutputStream dataInputStream = new DataOutputStream(fileOutputStream);

        dataInputStream.writeChar('A');
        dataInputStream.writeInt(100);
        dataInputStream.writeUTF("hello World...");
        dataInputStream.flush();
        dataInputStream.close();
    }
}
