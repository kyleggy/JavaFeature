package com.scott.java.design.pattern.prototype.define;

public class ConcreteProtoType1 implements ProtoType {

    @Override
    public ProtoType clone() {
        return new ConcreteProtoType1();
    }

    @Override
    public String toString() {
        return "ConcreteProtoType1";
    }
}
