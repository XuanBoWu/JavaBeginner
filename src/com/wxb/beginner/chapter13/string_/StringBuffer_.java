package com.wxb.beginner.chapter13.string_;

/**
 * @author alex
 * @version 1.0
 */
public class StringBuffer_ {
    public static void main(String[] args) {
        //创建
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer(100);
        StringBuffer stringBuffer2 = new StringBuffer("123");

        //和String的转换
        String str = "hello tom";
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3 = stringBuffer3.append(str);

        String str1 = stringBuffer3.toString();
        String str2 = new String(stringBuffer3);

        stringBuffer3.append("123");

    }
}
