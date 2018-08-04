package com.scott.java.design.pattern.structure.composite.definition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizhaok on 2016/12/11.
 */
public  abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public Component add(Component child) {
//        childList.add(child);
//        return child;
        return null;
    }

    public Component remove(Component child) {
//        childList.remove(child);
//        return child;
        return null;
    }

    public Component getChild(int index) {
        return null;
    }

    public Component getParent() {
        return null;
    }

    public  abstract void operation();

}
