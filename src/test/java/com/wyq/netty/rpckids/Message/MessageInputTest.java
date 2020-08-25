package com.wyq.netty.rpckids.Message;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;

import static org.junit.Assert.*;

public class MessageInputTest {

    @Data
    @NoArgsConstructor
    static
    class people{
        public String  name;
        public int id;

        public people(String wang, int i) {
            this.name=wang;
            this.id = i;
        }
    }

    @Test
    public void getPeople() {

        people p = new people("wang",1234);
        String s = JSONObject.toJSONString(p);
        System.out.println(s);
        MessageInput messageInput = new MessageInput("123","test","{\"id\":1234,\"name\":\"wang\"}");
        people p1 = messageInput.getPeople(people.class);
        System.out.println(p1.name);
        System.out.println(p1.id);

    }

    @Test
    public void testThrow() throws Throwable {

        if(true){
            throw new Exception("test");
        }
        System.out.println("noting still");
    }
}