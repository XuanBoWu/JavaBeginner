package com.wxb.beginner.hsp.MultiThread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author alex
 * @version 1.0
 */
public class TestThread3 implements Runnable {
    private String url;
    private String name;

    public TestThread3(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader2 downloader = new WebDownloader2();
        downloader.downloader(url, name);

        System.out.println("WebDownloader2:" + name + " 已下载");
    }

    public static void main(String[] args) {
        TestThread3 t1 = new TestThread3("https://dlcdn.apache.org//commons/io/binaries/commons-io-2.11.0-bin.zip", "commons-io-2.11.0-bin.zip");
        TestThread3 t2 = new TestThread3("https://github.com/apache/commons-io/archive/refs/tags/rel/commons-io-2.11.0.zip", "commons-io-2.11.0.zip");
        TestThread3 t3 = new TestThread3("https://builds.parsec.app/package/parsec-macos.pkg", "parsec-macos.pkg");

        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();

    }
}

class WebDownloader2 {
    public void downloader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
