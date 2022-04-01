package com.wxb.beginner.chapter10;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie.count = 1;
        Movie.count = 2;

        Movie movie = new Movie("1334");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;
    public static int count = 0;

    static {
        System.out.println("static");


    }


    {
        System.out.println("Open display");
        System.out.println("Ad start");
        System.out.println("Movie start");
    }

    public Movie(String name) {
//        System.out.println("Open display");
//        System.out.println("Ad start");
//        System.out.println("Movie start");
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
