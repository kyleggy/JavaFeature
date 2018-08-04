package com.scott.java.design.pattern.structure.composite.definition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizhaok on 2016/12/11.
 */
public class Composite extends Component {
    private List<Component> childList = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    public Component add(Component child) {
        childList.add(child);
        return child;
    }

    public Component remove(Component child) {
        childList.remove(child);
        return child;
    }

    public Component getChild(int index) {
        return childList.get(index);
    }

    @Override
    public void operation() {
        System.out.println("Composite " + name + " called with the child list: ");
        for(Component component: childList) {
            component.operation();

        }
    }
}
