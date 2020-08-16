package com.wyq.netty.sec;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;
import io.netty.util.CharsetUtil;
import jdk.net.SocketFlow;

import java.net.URI;
import java.nio.charset.Charset;

public class HttpServerHandler extends SimpleChannelInboundHandler<HttpObject> {
    protected HttpServerHandler() {
        super();
    }

    protected HttpServerHandler(boolean autoRelease) {
        super(autoRelease);
    }

    protected HttpServerHandler(Class<? extends HttpObject> inboundMessageType) {
        super(inboundMessageType);
        System.out.println("here in HttpServerHandler");

    }

    protected HttpServerHandler(Class<? extends HttpObject> inboundMessageType, boolean autoRelease) {
        super(inboundMessageType, autoRelease);
    }

    @Override
    public boolean acceptInboundMessage(Object msg) throws Exception {
        System.out.println("here in acceptInboundMessage");
        return super.acceptInboundMessage(msg);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("here in channelRead");
        super.channelRead(ctx, msg);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, HttpObject msg) throws Exception {

        if (msg instanceof HttpRequest){

            System.out.println("here in channelRead0");
            System.out.println(((HttpRequest) msg).method().name());
            System.out.println(((HttpRequest) msg).uri());



            if(new URI(((HttpRequest) msg).uri()).getPath().equals("/favicon.icon")){
                System.out.println("request uri is /favicon.icon");
                return;
            }

            ByteBuf content = Unpooled.copiedBuffer("hi wyq\n", CharsetUtil.UTF_8);

            FullHttpResponse defaultFullHttpResponse = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK,content);

            defaultFullHttpResponse.headers().set(HttpHeaderNames.CONTENT_TYPE,"text/plain");
            defaultFullHttpResponse.headers().set(HttpHeaderNames.CONTENT_LENGTH,content.readableBytes());

            ctx.writeAndFlush(defaultFullHttpResponse);


        }

    }
}
