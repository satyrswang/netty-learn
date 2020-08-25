package com.wyq.netty.rpckids.client;

import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Sharable
public class RpcClientChannelHandler extends ChannelInboundHandlerAdapter {

    private RpcClient client;
    private Throwable ConnectionClosed = new Exception("rpc connection error -- not activate");//可抛出的连接异常
    private final static Logger log = LoggerFactory.getLogger(RpcClientChannelHandler.class);
    //private ConcurrentMap<String, RpcFuture<?>> pendingTasks = new ConcurrentHashMap<>();//获得每个请求的future

    public RpcClientChannelHandler(){}

    public RpcClientChannelHandler(RpcClient rpcClient) {
        this.client = rpcClient;

    }


    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        super.channelRegistered(ctx);
        //activate后进行register
        System.out.println("here in client channel register");

    }

    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
        super.channelUnregistered(ctx);
    }

    @Override//回调
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        System.out.println("here in client channel active");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //对返回值进行接收处理
        System.out.println(msg);


    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        super.channelReadComplete(ctx);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
    }
}
