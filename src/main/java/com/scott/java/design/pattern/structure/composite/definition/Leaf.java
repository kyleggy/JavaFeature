package com.scott.java.design.pattern.structure.composite.definition;

/**
 * Created by lizhaok on 2016/12/11.
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println("Leaf " + name + " called");
    }
}
