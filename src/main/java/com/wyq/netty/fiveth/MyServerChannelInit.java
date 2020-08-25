package com.wyq.netty.fiveth;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

public class MyServerChannelInit extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ch.pipeline()
        .addLast(new IdleStateHandler(5,7,10, TimeUnit.SECONDS))
        .addLast(new MyServerChannelHandler());//IdleStateHandler生成一个事件，传入MyServerChannelHandler

    }
}
