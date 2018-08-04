package com.scott.java.design.pattern.structure.decorator.sample;

/**
 * Created by lizhaok on 2016/12/18.
 */
public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        System.out.println("Concrete component operation called");
    }
}
