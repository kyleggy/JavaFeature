package com.scott.java.design.pattern.behavior.strategy.textline;

/**
 * Created by lizhaok on 1/29/2018.
 */
public class Composition {
    private Compositor[] compositors;
    private int position;
    private int count;

    public Composition(Compositor[] compositors, int position, int count) {
        this.compositors = compositors;
        this.position = position;
        this.count = count;
    }

    public void repair () {
        for (int i = 0; i < compositors.length; i ++) {
            compositors[i].compose(position, count);
        }
    }

    public static void main(String[] args) {
        Compositor compositorA = new SimpleCompositor();
        Compositor compositorB = new TeXCompositor();
        Compositor compositorC = new ArrayCompositor();
        //Compositor[] compositors = new Compositor[3];
        //        compositors[0] = compositorA;
//        compositors[1] = compositorB;
//        compositors[2] = compositorC;
        Compositor[] compositors = {compositorA, compositorB, compositorC};

        Composition composition = new Composition(compositors, 5, 20);
        composition.repair();
    }
}
