package com.scott.java.design.pattern.prototype.define;

public class Client {

    public void operation(ProtoType protoType) {
        ProtoType protoTypeOperation = protoType.clone();
        System.out.println(protoTypeOperation);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.operation(new ConcreteProtoType1());
        client.operation(new ConcreteProtoType2());
    }
}
