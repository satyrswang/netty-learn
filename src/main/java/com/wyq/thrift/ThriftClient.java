package com.wyq.thrift;

import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import thrift.generated.Person;
import thrift.generated.PersonService;

public class ThriftClient {
    public static void main(String[] args) {
        TTransport transport = new TFramedTransport(new TSocket("localhost", 8080), 600);//和server的transport一样都为TFramedTransport
        TProtocol protocol = new TCompactProtocol(transport);
        PersonService.Client client = new PersonService.Client(protocol);

        try {
            transport.open();

            Person person = client.getPerson("张三");//客户端调用server的服务

            System.out.println(person.getName());
            System.out.println(person.getAge());
            System.out.println(person.isMarried());

            System.out.println("-------");

            Person person2 = new Person();

            person2.setName("李四");
            person2.setAge(30);
            person2.setMarried(true);

            client.setPerson(person2);
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        } finally {
            transport.close();
        }
    }
}
