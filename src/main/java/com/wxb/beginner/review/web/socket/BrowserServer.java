package com.wxb.beginner.review.web.socket;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Alex
 * @version 1.0
 * @projectName JavaBeginner
 * @package com.wxb.beginner.review.web.socket
 * @className BrowserServer
 * @description TODO
 * @date 2023/8/3 17:37
 */

public class BrowserServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            Socket accept = serverSocket.accept();
            BufferedInputStream inputStream = new BufferedInputStream(accept.getInputStream());
//            int i = 0;
//            while (true) {
//                i = inputStream.read();
//                if (i == -1) {
//                    break;
//                }
//                System.out.print((char) i);
//            }
            OutputStreamWriter writer = new OutputStreamWriter(accept.getOutputStream());
            String str = "HTTP/1.1 200 Accepted\nContent-Type:text/html;charset=UTF-8 \n\n123";
            StringBuffer sb = new StringBuffer();
            sb.append("HTTP/1.1 200 OK \n");
//            sb.append("Content-Language:zh-CN \n");
            // charset=UTF-8 解决中文乱码问题
//            sb.append("Content-Type:text/html;charset=UTF-8 \n");
//            sb.append("\nhello");
//            str = sb.toString();
            writer.write(str);
//            writer.write("HTTP/1.1 200 OK\r\n");
//            writer.write("\r\n");
//            writer.write("HelloWorld!");
            writer.flush();


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
        }
    }
}
