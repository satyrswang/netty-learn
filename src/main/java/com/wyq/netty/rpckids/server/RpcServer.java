//package com.wyq.netty.rpckids;
//
//import io.netty.bootstrap.ServerBootstrap;
//import io.netty.channel.ChannelInitializer;
//import io.netty.channel.ChannelOption;
//import io.netty.channel.ChannelPipeline;
//import io.netty.channel.nio.NioEventLoopGroup;
//import io.netty.channel.socket.SocketChannel;
//import io.netty.channel.socket.nio.NioServerSocketChannel;
//import io.netty.handler.timeout.ReadTimeoutHandler;
//
//public class RpcServer {
//    //主要功能：接收传输的参数对象，返回函数返回对象。
//    private String ip;
//    private int port;
//    private int ioThreads;
//    private int workerThreads;
//
//
//    public static void main(String[] args) {
//        ServerBootstrap bootstrap = new ServerBootstrap();
//        group = new NioEventLoopGroup(ioThreads);
//        bootstrap.group(group);
//        collector = new MessageCollector(handlers, registry, workerThreads);
//        MessageEncoder encoder = new MessageEncoder();
//        bootstrap.channel(NioServerSocketChannel.class).childHandler(new ChannelInitializer<SocketChannel>() {
//            @Override
//            public void initChannel(SocketChannel ch) throws Exception {
//                ChannelPipeline pipe = ch.pipeline();
//                pipe.addLast(new ReadTimeoutHandler(60));
//                pipe.addLast(new MessageDecoder());
//                pipe.addLast(encoder);
//                pipe.addLast(collector);
//            }
//        });
//        bootstrap.option(ChannelOption.SO_BACKLOG, 100).option(ChannelOption.SO_REUSEADDR, true)
//                .option(ChannelOption.TCP_NODELAY, true).childOption(ChannelOption.SO_KEEPALIVE, true);
//        serverChannel = bootstrap.bind(this.ip, this.port).channel();
//        LOG.warn("server started @ {}:{}\n", ip, port);
//    }
//}
