package com.wyq.netty.rpckids;

import com.wyq.netty.rpckids.Message.MessageDecoder;
import com.wyq.netty.rpckids.Message.MessageEncoder;
import com.wyq.netty.rpckids.server.RpcServerChannelHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RpcServer {

    private static final Logger LOG = LoggerFactory.getLogger(RpcServer.class);
    private static String ip;
    private static int port;
    private static int ioThreads;
    private static int workerThreads;


    public static void main(String[] args) {
        ServerBootstrap bootstrap = new ServerBootstrap();
        EventLoopGroup group = new NioEventLoopGroup(ioThreads);
        bootstrap.group(group);
        RpcServerChannelHandler collector = new RpcServerChannelHandler();
        MessageEncoder encoder = new MessageEncoder();
        bootstrap.channel(NioServerSocketChannel.class).childHandler(new ChannelInitializer<SocketChannel>() {
            @Override
            public void initChannel(SocketChannel ch) throws Exception {
                ChannelPipeline pipe = ch.pipeline();
                pipe.addLast(new ReadTimeoutHandler(60));
                pipe.addLast(new MessageDecoder());
                pipe.addLast(encoder);
                pipe.addLast(collector);
            }
        });
        bootstrap.option(ChannelOption.SO_BACKLOG, 100).option(ChannelOption.SO_REUSEADDR, true)
                .option(ChannelOption.TCP_NODELAY, true).childOption(ChannelOption.SO_KEEPALIVE, true);
        Channel serverChannel = bootstrap.bind(ip,port).channel();
        LOG.warn("server started @ {}:{}\n", ip, port);
    }
}
