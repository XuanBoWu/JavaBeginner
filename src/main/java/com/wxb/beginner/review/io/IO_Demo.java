package com.wxb.beginner.review.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutionException;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.review.io
 * @className Example01
 * @description TODO
 * @date 2023/7/27 21:15
 */

public class IO_Demo {
    public static void main(String[] args) throws Exception {
        Example04();
//        Example06();


    }

    public static void Example01() throws Exception{
        FileInputStream in = new FileInputStream("/Users/alex/Desktop/Java/JavaBeginner/src/main/java/com/wxb/beginner/review/io/test.txt");
        int b = 0;
        while (true) {
            b = in.read();
            if (b == -1) {
                break;
            }
            System.out.println(b);
        }
        in.close();
    }

    public static void Example02() throws Exception{
        FileOutputStream out = new FileOutputStream("/Users/alex/Desktop/Java/JavaBeginner/src/main/java/com/wxb/beginner/review/io/test.txt");
        String s = "hi Java\n";
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            out.write(bytes[i]);
        }
        out.close();
    }

    public static void Example03() throws Exception {
        FileOutputStream out = new FileOutputStream("/Users/alex/Desktop/Java/JavaBeginner/src/main/java/com/wxb/beginner/review/io/test.txt", true);
        String str = "hello java\n";
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            out.write(bytes[i]);
        }
        out.close();
    }

    public static void Example04() throws Exception {
        FileInputStream in = new FileInputStream("/Users/alex/Movies/学习视频/CS61B-Spring-2021-中英双语字幕/3. Testing/字幕/中文/CS61B Sp21- Discussion 02-zh.srt");
        FileOutputStream out = new FileOutputStream("test/new.srt");
        int len;
        int count = 0;
        while ((len = in.read()) != -1) {
            System.out.println(count++);
            out.write(len);
        }
        in.close();
        out.close();

    }

    public static void Example05() throws Exception{
        FileInputStream in = new FileInputStream("/Users/alex/Movies/学习视频/CS61B-Spring-2021-中英双语字幕/3. Testing/字幕/中文/CS61B Sp21- Discussion 02-zh.srt");
        FileOutputStream out = new FileOutputStream("test/new.srt");
        int len;
        int count = 0;
        byte[] bytes = new byte[1024];
        while ((len = in.read(bytes)) != -1) {
            System.out.println(count++);
            out.write(bytes, 0, len);
        }
        in.close();
        out.close();
    }

    public static void Example06() throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/alex/Movies/学习视频/CS61B-Spring-2021-中英双语字幕/3. Testing/字幕/中文/CS61B Sp21- Discussion 02-zh.srt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test/new.srt"));
        int len;
        int count = 0;
        while ((len = bis.read()) != -1) {
            System.out.println(count++);
            bos.write(len);
        }

    }
}
