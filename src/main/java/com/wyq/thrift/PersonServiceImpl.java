package com.wyq.thrift;

import thrift.generated.Person;
import thrift.generated.DataException;
import thrift.generated.PersonService;

public class PersonServiceImpl implements PersonService.Iface {
    @Override
    public Person getPerson(String name) throws DataException {
        System.out.println("here we in getPerson method");
        System.out.println(name);
        Person person = new Person();
        person.setMarried(false);
        person.setName(name);
        person.setAge(20);
        System.out.println("person got");
        return  person;
    }

    @Override
    public void setPerson(Person person) throws DataException {
        System.out.println("here in setPerson");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println("person seted");
    }
}
