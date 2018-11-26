package com.scott.java.design.pattern.prototype.define;

public class ConcreteProtoType2 implements ProtoType {

    @Override
    public ProtoType clone() {
        return new ConcreteProtoType2();
    }

    @Override
    public String toString() {
        return "ConcreteProtoType2";
    }
}
