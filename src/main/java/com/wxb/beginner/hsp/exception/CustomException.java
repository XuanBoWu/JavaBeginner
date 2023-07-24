package com.wxb.beginner.hsp.exception;

/**
 * @author alex
 * @version 1.0
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 130;

        if ( !(age >= 18 && age <= 120)) {
            throw new AgeException("Age must 18~120");
        }
        System.out.println("Age is correct");
    }
}

class AgeException extends RuntimeException {

    public AgeException(String message) {
        super(message);
    }
}