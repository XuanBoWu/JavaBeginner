package com.wxb.beginner.review.web.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.review.web.socket
 * @className Client
 * @description TODO
 * @date 2023/8/2 22:11
 */

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            System.out.println("已连接到服务端");
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            System.out.println("发送消息：hello");
            writer.write("hello\n");
            writer.flush();

            System.out.println("接受消息：");
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(reader.readLine());
            reader.close();
            socket.close();

        } catch (IOException e) {
            System.out.println("连接失败");
            throw new RuntimeException(e);
        }
    }
}
