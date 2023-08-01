package com.wxb.beginner.review.io;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.review.io
 * @className BitStream
 * @description TODO
 * @date 2023/7/31 19:27
 */

public class BitStream {
    public static void main(String[] args) throws IOException {
        example03();
    }

    public static void example01() throws IOException {
        int a = System.in.read();
        System.out.println(a);

        char b = '中';
        System.out.println((int) b);
    }

    public static void example02() throws IOException {
        char a = (char) System.in.read();
        System.out.println(a);

        char b = '中';
        System.out.println(b);
    }

    public static void example03() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        int read = inputStreamReader.read();
        System.out.println(read);
        System.out.println((char) read);

        InputStreamReader inputStreamReader2 = new InputStreamReader(System.in);
        char[] chars = new char[2];
        int c = inputStreamReader2.read(chars);
        System.out.println("读取到的字符数：" + c);
        System.out.println(chars[0]);
        System.out.print("。");
        System.out.println(chars[1]);

    }
}
