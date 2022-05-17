package com.wxb.beginner.chapter14.Homework;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author alex
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        News news01 = new News("新冠确诊病例超千万，数百万印度教信徒赴恒河\"圣浴\"引民众担忧");
        News news02 = new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");
        ArrayList list = new ArrayList();
        list.add(news01);
        list.add(news02);

        Collections.reverse(list);

        for (Object o : list) {
            News n = (News) o;
            if (n.getTitle().length() > 15) {
                System.out.println(n.getTitle().substring(0, 15) + "...");
            } else {
                System.out.println(n.getTitle());
            }
        }
    }
}

class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}