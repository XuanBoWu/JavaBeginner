package com.wxb.beginner.review.io;

import java.io.*;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.review.io
 * @className StringStream
 * @description TODO
 * @date 2023/8/1 14:05
 */

public class StringStream {
    public static void main(String[] args) throws IOException {
        example10();
    }

    public static void example07() throws IOException {
        FileReader reader = new FileReader("README.md");
        int ch;

        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();
    }

    public static void example08() throws IOException {
        FileWriter writer = new FileWriter("/Users/alex/Desktop/Java/JavaBeginner/src/main/java/com/wxb/beginner/review/io/test.txt", true);
        String str = "JavaBeginner---Java初学者项目";
        writer.write(str);
        writer.close();
    }

    public static void example09() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("README.md"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test/test.md"));

        String str;
        while ((str = bufferedReader.readLine()) != null) {
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader.close();
    }

    public static void example10() throws IOException {
        FileInputStream in = new FileInputStream("README.md");
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader reader = new BufferedReader(isr);

        FileOutputStream out = new FileOutputStream("test/new.md");
        OutputStreamWriter osr = new OutputStreamWriter(out);
        BufferedWriter writer = new BufferedWriter(osr);

        String str;
        while ((str = reader.readLine()) != null) {
            writer.write(str);
            writer.newLine();
        }
        reader.close();
        writer.close();
    }
}
