package com.wxb.beginner.review.io.task7_1;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.review.io.task7_1
 * @className Book
 * @description TODO
 * @date 2023/7/28 17:29
 */

public class Book {
    private int bookNum;
    private String bookName;
    private int transactionCount;
    private double unitPrice;
    private double totalPrice;
    private String publisher;

    public Book(int bookNum, String bookName, int transactionCount, double unitPrice, String publisher) {
        this.bookNum = bookNum;
        this.bookName = bookName;
        this.transactionCount = transactionCount;
        this.unitPrice = unitPrice;
        this.totalPrice = unitPrice * transactionCount;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        String message = "图书编号：" + bookNum + "\t图书名称：" + bookName + "\t出版社：" + publisher + "\t单价：" + unitPrice + "\t库存：" + transactionCount;
        return message;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getBookNum() {
        return bookNum;
    }

    public String getBookName() {
        return bookName;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getPublisher() {
        return publisher;
    }
}
