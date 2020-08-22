package com.wyq.netty.rpckids.Message;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.ReplayingDecoder;
import io.netty.util.CharsetUtil;

public class MessageDecoder extends ReplayingDecoder<MessageInput> {


    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        String requestid = readStr(in);
        String type = readStr(in);//由此server确定调用哪个函数
        String content = readStr(in); //传入时，client方将对象转为jsonstring 传过去
        // content中是以jsonstring形式包含着请求参数
        out.add(new MessageInput(requestid,type,content));

    }

    private String readStr(ByteBuf in) {
        int len = in.readInt();//首先对in读取一个int值为长度

        if (len < 0 || len > (1 << 20)) {
            throw new DecoderException("string too long len=" + len);
        }

        byte[] bytes = new byte[len];
        in.readBytes(bytes);//剩下的buf读入为bytes转为string
        return new String(bytes, CharsetUtil.UTF_8);

    }

}
