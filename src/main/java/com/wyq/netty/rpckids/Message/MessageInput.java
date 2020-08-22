package com.wyq.netty.rpckids.Message;

import lombok.Data;
import com.alibaba.fastjson.JSON;
import lombok.NoArgsConstructor;

@Data
public class MessageInput {

    private String requestId;
    private String type;
    private String  peopleString ;

    public MessageInput(String requestId, String type, String p) {
        this.requestId = requestId;
        this.type = type;
        this.peopleString = p; //是以jsonstring形式包含着请求参数
    }

    public MessageInput(String requestId, String type) {
        this.requestId = requestId;
        this.type = type;
    }

    public <T> T getPeople(Class<T> clazz) {
        if (peopleString == null) {
            return null;
        }
        return JSON.parseObject(peopleString, clazz);
    }

    @Data
    @NoArgsConstructor
    static
    class people{
        public String  name;
        public int id;
    }
}

