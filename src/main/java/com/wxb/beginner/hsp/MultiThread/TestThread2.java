package com.wxb.beginner.hsp.MultiThread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author alex
 * @version 1.0
 */
public class TestThread2 extends Thread{
    private String url;
    private String name;
    TestThread2(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        WebDownloader downloader = new WebDownloader();
        downloader.downloader(url, name);
        System.out.println(name + " :已下载");
    }

    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("https://dlcdn.apache.org//commons/io/binaries/commons-io-2.11.0-bin.zip", "commons-io-2.11.0-bin.zip");
        TestThread2 t2 = new TestThread2("https://github.com/apache/commons-io/archive/refs/tags/rel/commons-io-2.11.0.zip", "commons-io-2.11.0.zip");
        TestThread2 t3 = new TestThread2("https://builds.parsec.app/package/parsec-macos.pkg", "parsec-macos.pkg");

        t1.start();
        t2.start();
        t3.start();
    }

}

class WebDownloader {
    public void downloader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

