package com.wyq.netty.third;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.time.LocalDateTime;

public class ClientChannelHandler extends SimpleChannelInboundHandler<String> {
    protected ClientChannelHandler() {
        super();
    }

    protected ClientChannelHandler(boolean autoRelease) {
        super(autoRelease);
    }

    protected ClientChannelHandler(Class<? extends String> inboundMessageType) {
        super(inboundMessageType);
    }

    protected ClientChannelHandler(Class<? extends String> inboundMessageType, boolean autoRelease) {
        super(inboundMessageType, autoRelease);
    }

    @Override
    public boolean acceptInboundMessage(Object msg) throws Exception {
        return super.acceptInboundMessage(msg);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        System.out.println("here in client channel active");
        ctx.writeAndFlush("here begin");
    } ///////////回调在这里！


    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        super.channelRead(ctx, msg);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {

        System.out.println("here in client channelhandler channelRead0");
        System.out.println("client got remote : "+ctx.channel().remoteAddress() +" "+ LocalDateTime.now());
        System.out.println("client got msg : "+msg);

        ctx.writeAndFlush("client handler : "+LocalDateTime.now());

    }
}
