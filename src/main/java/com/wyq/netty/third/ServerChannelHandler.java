package com.wyq.netty.third;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.UUID;

public class ServerChannelHandler extends SimpleChannelInboundHandler<String> {


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        System.out.println("here in channelRead0 server receive : " + msg+" "+ctx.channel().remoteAddress());
        ctx.writeAndFlush("server handler : " +UUID.randomUUID());
    }
}

