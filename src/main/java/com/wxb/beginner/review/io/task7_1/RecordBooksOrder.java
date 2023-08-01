package com.wxb.beginner.review.io.task7_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.review.io.task7_1
 * @className RecordBooksOrder
 * @description TODO
 * @date 2023/7/28 17:46
 */

public class RecordBooksOrder {
    static List<Book> bookList = new ArrayList<>();

    public static void init() {
        bookList.add(new Book(101, "Java核心技术", 10, 49.9, "北京大学出版社"));
        bookList.add(new Book(102, "Python教程", 20, 23, "西安工业出版社"));
        bookList.add(new Book(103, "SSM实战", 10, 34.9, "清华大学出版社"));
        bookList.add(new Book(104, "剑指offer", 15, 79.9, "华中科技大学出版社"));
        bookList.add(new Book(105, "计算机网络", 5, 59.9, "工业大学出版社"));
    }

    public static Book getBookById(int id) {
        for (Book book:
             bookList) {
            if (book.getBookNum() == id) {
                return book;
            }
        }
        System.out.println("没有找到编号为" + id + "的图书信息");
        return null;
    }
}
