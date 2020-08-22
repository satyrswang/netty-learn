package com.wyq.netty.rpckids.Message;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class MessageOutput {

    private String requestId;
    private String type;
    private String returnString ;

    public MessageOutput(String requestId, String type, String out) {
        this.requestId = requestId;
        this.type = type;
        this.returnString = out; //是以jsonstring形式包含着请求参数
    }



    public <T> T getReturn(Class<T> clazz) {
        if (returnString == null) {
            return null;
        }
        return JSON.parseObject(returnString, clazz);
    }

    @Data
    @NoArgsConstructor
    static
    class people{
        public String name;
        public String email;
        public int rank;
    }
}
