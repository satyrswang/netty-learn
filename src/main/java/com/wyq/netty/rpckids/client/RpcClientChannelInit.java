package com.wyq.netty.rpckids.client;

import com.wyq.netty.rpckids.Message.MessageDecoder;
import com.wyq.netty.rpckids.Message.MessageEncoder;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;


public class RpcClientChannelInit  extends ChannelInitializer<SocketChannel> {



    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ch.pipeline()
                .addLast(new ReadTimeoutHandler(60))
                .addLast(new MessageDecoder())
                .addLast(new MessageEncoder())
                .addLast(new RpcClientChannelHandler());


    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        super.exceptionCaught(ctx, cause);
    }
}
