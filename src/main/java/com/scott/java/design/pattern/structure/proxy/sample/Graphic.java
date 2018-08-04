package com.scott.java.design.pattern.structure.proxy.sample;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by lizhaok on 2017/3/4.
 */
public abstract class Graphic {

    protected Graphic(){};

    public abstract void draw(Point at);

    public abstract void handleMouse(Event event);

    public abstract Point getExtent();

    public abstract void load(InputStream fileInputStream);

    public abstract void save(OutputStream outputStream);

}
