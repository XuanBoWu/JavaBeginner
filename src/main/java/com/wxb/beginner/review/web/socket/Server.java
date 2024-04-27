package com.wxb.beginner.review.web.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.review.web.socket
 * @className Server
 * @description TODO
 * @date 2023/8/2 22:11
 */

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            while (true) {
                System.out.println("等待连接。。。");
                Socket socket = serverSocket.accept();
                System.out.println("连接成功！ 客户端地址：" + socket.getInetAddress().getHostAddress());
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println("接受到消息：");
                System.out.println(reader.readLine());

                System.out.println("发送消息：\"已收到消息！\"");
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                writer.write("已收到消息！\n");
                writer.flush();
                writer.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
