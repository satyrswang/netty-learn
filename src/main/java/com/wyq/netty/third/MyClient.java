package com.wyq.netty.third;

//http1.0 1.1短连接--无法实现在线聊天、消息推送 ，空轮询、携带header信息
//http2长连接还没起来，现在进行在线聊天、消息推送场景下，使用websocket 仅传递数据本身无需header无冗余
//自定义协议制定

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

public class MyClient {

    public static void main(String[] args) throws InterruptedException {
        EventLoopGroup client =  new NioEventLoopGroup();
        Bootstrap b = new Bootstrap();

        try {
            b.group(client).channel(NioSocketChannel.class)
                    .handler(new ClientChannelInit());

            ChannelFuture channelFuture = b.connect("localhost",8080).sync();
            channelFuture.channel().closeFuture().sync();

        }finally {
            client.shutdownGracefully();
        }
    }
}
