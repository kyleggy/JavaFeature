package com.scott.java.design.pattern.structure.composite.graphicsample;

import org.junit.Test;

/**
 * Created by lizhaok on 2016/12/11.
 */
public class GraphicClient {

    @Test
    public void testGraphic() {
        Graphic graphic;

        Graphic lineA = new Line("LineA");
        Graphic rectangleA = new Rectangle("RectangeA");
        Graphic textA = new Text("TextA");
        Graphic pictureA = new Picture("PictureA");
        pictureA.add(lineA);
        pictureA.add(textA);
        pictureA.add(rectangleA);

        Graphic pictureB = new Picture("PictureB");
        pictureA.add(pictureB);

        Graphic lineB = new Line("LineB");
        Graphic rectangleB = new Rectangle("RectangleB");
        Graphic textB = new Text("TextB");
        pictureB.add(lineB);
        pictureB.add(rectangleB);
        pictureB.add(textB);

        graphic = pictureA;
        graphic.draw();

        graphic = pictureB;
        graphic.draw();

    }
}
