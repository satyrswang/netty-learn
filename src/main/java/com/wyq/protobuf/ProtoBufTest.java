package com.wyq.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;

import static com.wyq.protobuf.AddressBookProtos.Person.PhoneType.MOBILE;

public class ProtoBufTest {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        AddressBookProtos.AddressBook addressBook = AddressBookProtos.AddressBook.newBuilder().addPeople(0,
                AddressBookProtos.Person.newBuilder()
                        .setId(2).setEmail("qqmail").setName("wang")
                        .addPhones(0,
                                AddressBookProtos.Person.PhoneNumber.newBuilder()
                                        .setNumber("189").setType(MOBILE)
                                        .build())
                        .build()).build();

        byte[] addressBytes = addressBook.toByteArray();
        System.out.println(addressBytes.toString()); //[B@133314b
        System.out.println("then pares from bytes");
        AddressBookProtos.AddressBook addressBook2 = AddressBookProtos.AddressBook.parseFrom(addressBytes);
        System.out.println(addressBook2.toString());
        System.out.println(addressBook2.getPeople(0).getEmail().toString());

    }
}
