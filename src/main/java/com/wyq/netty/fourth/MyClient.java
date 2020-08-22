package com.wyq.netty.fourth;

//http1.0 1.1短连接--无法实现在线聊天、消息推送 ，空轮询、携带header信息
//http2长连接还没起来，现在进行在线聊天、消息推送场景下，使用websocket 仅传递数据本身无需header无冗余
//自定义协议制定

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyClient {

    public static void main(String[] args) throws InterruptedException, IOException {
        EventLoopGroup client =  new NioEventLoopGroup();
        Bootstrap b = new Bootstrap();

        try {
            b.group(client).channel(NioSocketChannel.class)
                    .handler(new MyClientChannelInit());

            Channel channel = b.connect("localhost",8080).sync().channel();
            // 客户端从键盘输入中读取内容
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // 客户端不断的把键盘输入的内容发送到和服务端建立起来的连接中
            for (;;) {
                channel.writeAndFlush(br.readLine() + "\r\n");
            }

        }finally {
            client.shutdownGracefully();
        }
    }
}
