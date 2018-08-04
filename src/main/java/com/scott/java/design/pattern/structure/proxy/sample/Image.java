package com.scott.java.design.pattern.structure.proxy.sample;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by lizhaok on 2017/3/4.
 */
public class Image extends Graphic {
    public String fileNamePath;
    private Point extent;

    public Image(String fileNamePath) {
        this.fileNamePath = fileNamePath;
    }

    @Override
    public void draw(Point at) {
        extent = at;
        //draw it...
        System.out.println("x=" + at.getX() + ", y =" + at.getY());

    }

    @Override
    public void handleMouse(Event event) {

    }

    @Override
    public Point getExtent() {
        return extent;
    }

    @Override
    public void load(InputStream fileInputStream) {

    }

    @Override
    public void save(OutputStream outputStream) {

    }
}
