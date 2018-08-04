package com.scott.java.design.pattern.structure.composite.definition;

import org.junit.Test;

/**
 * Created by lizhaok on 2016/12/11.
 */
public class Client {

    @Test
    public void testComposite() {
        Component component;
        Composite compositeA = new Composite("CompositeA");
        Leaf leafA = new Leaf("LeafA");
        compositeA.add(leafA);

        Composite compositeB = new Composite("CompositeB");
        Leaf leafB = new Leaf("LeafB");
        compositeB.add(leafB);
        compositeA.add(compositeB);

        component = compositeA;

        component.operation();

        component = compositeB;
        component.operation();

        component = leafA;
        component.operation();

    }
}
