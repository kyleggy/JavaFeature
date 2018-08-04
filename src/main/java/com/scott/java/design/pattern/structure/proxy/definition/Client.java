package com.scott.java.design.pattern.structure.proxy.definition;

/**
 * Created by lizhaok on 2017/3/4.
 */
public class Client {

    public void callSubject(Subject subject) {
        subject.request();
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.callSubject(new ProxySubject());
    }
}
