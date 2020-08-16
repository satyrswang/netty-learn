package com.wyq.netty.sec;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;

public class HttpServerInit extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {

        ch.pipeline()
                .addLast("HttpServerCodec",new HttpServerCodec())   //每次创建一个新的对象
                .addLast("MyHttpServerHandler",new HttpServerHandler());
    }


}
