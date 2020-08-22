package com.wyq.netty.third;

import com.wyq.netty.sec.HttpServerInit;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class MyServer {


    public static void main(String[] args) throws InterruptedException {

        int port = 8080;

        EventLoopGroup boss = new NioEventLoopGroup();
        EventLoopGroup worker = new NioEventLoopGroup();

        ServerBootstrap serverBootstrap = new ServerBootstrap();
        try {
            serverBootstrap.group(boss,worker)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ServerChannelInit());

            ChannelFuture f = serverBootstrap.bind(port).sync();
            f.channel().closeFuture().sync();

        }finally {
            boss.shutdownGracefully();
            worker.shutdownGracefully();
        }
    }
}
