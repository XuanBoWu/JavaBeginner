package com.wxb.beginner.review.io.task7_1;

import java.util.Scanner;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.review.io.task7_1
 * @className Main
 * @description TODO
 * @date 2023/7/29 01:18
 */

public class Main {
    public static void main(String[] args) {
        RecordBooksOrder.init();
        for (Book b:
             RecordBooksOrder.bookList) {
            System.out.println(b.toString());
        }

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入图书编号：");
            int bookId = scanner.nextInt();
            Book book = RecordBooksOrder.getBookById(bookId);
            if (book != null) {
                System.out.println("当前图书信息：" + book);
                System.out.println("请输入购买数量：");
                int bookCount = scanner.nextInt();
                if (bookCount <= book.getTransactionCount()) {
                    Book newBook = new Book(book.getBookNum(), book.getBookName(), book.getTransactionCount() - bookCount, book.getUnitPrice(), book.getPublisher());
                    FileUtil.saveBook(newBook);
                    book.setTransactionCount(book.getTransactionCount() - bookCount);
                } else {
                    System.out.println("库存不足！");

                }
            } else {
                System.out.println("图书编号错误");
            }
        }
    }
}
