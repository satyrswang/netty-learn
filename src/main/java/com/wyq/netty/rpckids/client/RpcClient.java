package com.wyq.netty.rpckids.client;

import com.wyq.netty.rpckids.Message.MessageOutput;
import com.wyq.netty.rpckids.Message.RequestId;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;


public class RpcClient {

    public static void main(String[] args) {
        //向server发送参数，server调用相应interface 将返回值以对象形式返回给client

        String ip = "localhost";
        int port = 8989;
        Bootstrap bootstrap = new Bootstrap();
        EventLoopGroup client =  new NioEventLoopGroup();
        String requestId = RequestId.next();//随机uid
        MessageOutput output = new MessageOutput(requestId, "getRankEmail",
                "");

        try{
            //client需要bootstrap eventgroop
            bootstrap.group(client)
                    .channel(NioServerSocketChannel.class)
                    .handler(new RpcClientChannelInit());

            Channel channel = bootstrap.connect(ip, port).syncUninterruptibly().channel();//暂时不考虑重连
            bootstrap.option(ChannelOption.TCP_NODELAY, true).option(ChannelOption.SO_KEEPALIVE, true);//tcp 以及 长连接(心跳包)
            channel.writeAndFlush(output);

        }catch (Exception e){
            e.printStackTrace();
        }finally {

            client.shutdownGracefully(0, 5000, TimeUnit.SECONDS);
        }
    }
}
