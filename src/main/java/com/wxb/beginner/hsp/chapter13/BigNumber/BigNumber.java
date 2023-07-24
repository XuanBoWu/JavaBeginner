package com.wxb.beginner.hsp.chapter13.BigNumber;

import java.math.BigInteger;

/**
 * @author alex
 * @version 1.0
 */
public class BigNumber {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("12312312321312321312321312312321312");
        System.out.println(bigInteger);

        System.out.println(bigInteger.multiply(new BigInteger("9090909090909090909090")));
    }
}
