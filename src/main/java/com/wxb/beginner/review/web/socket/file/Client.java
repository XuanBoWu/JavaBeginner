package com.wxb.beginner.review.web.socket.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.review.web.socket.file
 * @className Client
 * @description TODO
 * @date 2023/8/3 16:20
 */

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress("localhost", 8080));
            BufferedInputStream localFileInput = new BufferedInputStream(new FileInputStream("/Users/alex/Desktop/截屏2023-07-10 23.27.30.png"));
            BufferedOutputStream socketOutput = new BufferedOutputStream(socket.getOutputStream());
            int len;
            byte[] bytes = new byte[1024];
            while ((len = localFileInput.read(bytes)) != -1) {
                socketOutput.write(bytes, 0, len);
            }
            socketOutput.flush();

        } catch (IOException e) {
            System.out.println("连接服务器失败");
            e.printStackTrace();
        }
    }
}
