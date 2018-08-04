package com.scott.java.design.pattern.structure.composite.graphicsample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizhaok on 2016/12/11.
 */
public class Picture extends Graphic {
    private List<Graphic> childList = new ArrayList<>();

    public Picture(String name) {
        super(name);
    }

    @Override
    public Graphic add(Graphic child) {
        this.childList.add(child);
        return child;
    }

    @Override
    public Graphic remove(Graphic child) {
        this.childList.remove(child);
        return child;
    }

    @Override
    public Graphic getChild(int index) {
        return this.childList.get(index);
    }

    @Override
    public void draw() {
        System.out.println("Picture " + name + " called");
        for(int i = 0; i < childList.size(); i ++) {
            getChild(i).draw();
        }

    }
}
