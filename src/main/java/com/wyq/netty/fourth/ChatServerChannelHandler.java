package com.wyq.netty.fourth;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

import java.util.UUID;

public class ChatServerChannelHandler extends SimpleChannelInboundHandler<String> {

    private static ChannelGroup channels = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);//成员变量

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        System.out.println("here in read0");
        Channel channel = ctx.channel();

        channels.forEach(ch ->{
            if (channel != ch){  // 对channelgroup中每一个channel与发送消息的channel做判断
                ch.writeAndFlush(channel.remoteAddress() + " 发送的消息：" + msg + "\n");
            } else {
                ch.writeAndFlush("【自己】" + msg + "\n");
            }
        });
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        //super.handlerAdded(ctx);
        System.out.println("here in server channel added");
        Channel channel = ctx.channel();
        channels.writeAndFlush("[server channel added] : " +channel.remoteAddress()+"\n");//写到所有的channel
        channels.add(channel);
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        //super.handlerRemoved(ctx);
        Channel channel = ctx.channel();
        channels.writeAndFlush("[server channel removed] : " +channel.remoteAddress()+"\n");
        //channels.remove(channel);在关闭客户端的时候自动remove


    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        System.out.println("[server channel active] : " +channel.remoteAddress()+"\n");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        System.out.println("[server channel inactive] : " +channel.remoteAddress()+"\n");
    }
}
