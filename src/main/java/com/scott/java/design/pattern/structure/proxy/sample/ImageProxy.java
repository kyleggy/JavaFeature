package com.scott.java.design.pattern.structure.proxy.sample;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by lizhaok on 2017/3/4.
 */
public class ImageProxy extends Graphic {
    private String fileNamePath;
    private Image image;
    private Point extent;

    public ImageProxy(String fileNamePath) {
        this.fileNamePath = fileNamePath;
    }

    protected Image getImage() {
        if (image == null) {
            return new Image(fileNamePath);
        }
        return image;
    }

    @Override
    public void draw(Point at) {
        getImage().draw(at);

    }

    @Override
    public void handleMouse(Event event) {
        getImage().handleMouse(event);

    }

    @Override
    public Point getExtent() {
        if (extent == null) {
            return getImage().getExtent();
        }
        return extent;
    }

    @Override
    public void load(InputStream fileInputStream) {

    }

    @Override
    public void save(OutputStream outputStream) {

    }
}
