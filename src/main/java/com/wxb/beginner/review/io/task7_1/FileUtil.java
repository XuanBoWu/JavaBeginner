package com.wxb.beginner.review.io.task7_1;

import com.wxb.beginner.hsp.chapter13.date.Date_;

import javax.print.DocFlavor;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.review.io.task7_1
 * @className FileUtil
 * @description TODO
 * @date 2023/7/29 01:26
 */

public class FileUtil {
    public static final String FIELD_SEPARATE = ",";
    public static final String LINE_SEPARATE = "\r";

    public static void saveBook(Book book) {
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyyMMdd");
        String fileName = "销售记录-" + format.format(date) + ".csv";
        InputStream in = null;
        try {
            in = new FileInputStream(fileName);
            if (in != null) {
                in.close();
                createFile(fileName, true, book);

            }


        } catch (FileNotFoundException e) {
            createFile(fileName, false, book);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void createFile(String fileName, boolean label, Book book) {
        BufferedOutputStream out = null;
        StringBuffer stringBuffer = new StringBuffer();
        try {

            if (label) {
                out = new BufferedOutputStream(new FileOutputStream(fileName, true));
            } else {
                out = new BufferedOutputStream(new FileOutputStream(fileName));
                String[] fieldSort = new String[]{"图书编号", "图书名称", "购买数量", "单价", "总价", "出版社"};
                for (String s:
                     fieldSort) {
                    stringBuffer.append(s).append(FIELD_SEPARATE);
                }
            }
            stringBuffer.append(LINE_SEPARATE);
            stringBuffer.append(book.getBookNum()).append(FIELD_SEPARATE);
            stringBuffer.append(book.getBookName()).append(FIELD_SEPARATE);
            stringBuffer.append(book.getTransactionCount()).append(FIELD_SEPARATE);
            stringBuffer.append(book.getUnitPrice()).append(FIELD_SEPARATE);
            stringBuffer.append(book.getTotalPrice()).append(FIELD_SEPARATE);
            stringBuffer.append(book.getPublisher()).append(FIELD_SEPARATE);
            String str = stringBuffer.toString();
            byte[] b = str.getBytes();

            for (byte value : b) {
                out.write(value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
