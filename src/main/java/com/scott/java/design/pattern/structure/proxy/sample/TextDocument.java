package com.scott.java.design.pattern.structure.proxy.sample;

/**
 * Created by lizhaok on 2017/3/4.
 */
public class TextDocument {
    private Graphic graphic;

    public void insert(Graphic graphic) {
        this.graphic = graphic;
    }

    public void draw() {
        graphic.draw(new Point(1,2));
    }

    public static void main(String[] args) {
        TextDocument textDocument = new TextDocument();
        textDocument.insert(new ImageProxy("c\\123.txt"));
        textDocument.draw();
        //.......
    }

}
