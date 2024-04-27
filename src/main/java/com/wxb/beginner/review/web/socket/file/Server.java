package com.wxb.beginner.review.web.socket.file;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.review.web.socket.file
 * @className Server
 * @description TODO
 * @date 2023/8/3 16:20
 */

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            while (true){
                System.out.println("等待连接。。。");
                Socket socket = serverSocket.accept();
                System.out.println("已连接到客户端，IP：" + socket.getInetAddress());
                BufferedInputStream inputStream = new BufferedInputStream(socket.getInputStream());
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("test/123.png"));
                int len;
                byte[] bytes = new byte[1024];
                while ((len = inputStream.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, len);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
