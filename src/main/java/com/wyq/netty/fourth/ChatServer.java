package com.wyq.netty.fourth;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class ChatServer {

    //client起来之后，回调client端的activate，发送给server。 然后接受server换行消息，进入read0处理
    //server先是加入channel，加入时候广播，client收到广播。server add后activate。 接收到client换行消息后，进入Channelread0
    public static void main(String[] args) throws InterruptedException {

        int port = 8080;

        EventLoopGroup boss = new NioEventLoopGroup();
        EventLoopGroup worker = new NioEventLoopGroup();

        ServerBootstrap serverBootstrap = new ServerBootstrap();
        try {
            serverBootstrap.group(boss,worker)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChatServerChannelInit());

            ChannelFuture f = serverBootstrap.bind(port).sync();
            f.channel().closeFuture().sync();

        }finally {
            boss.shutdownGracefully();
            worker.shutdownGracefully();
        }
    }
}
