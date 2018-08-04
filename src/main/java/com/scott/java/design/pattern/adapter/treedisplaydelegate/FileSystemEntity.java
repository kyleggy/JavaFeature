package com.scott.java.design.pattern.adapter.treedisplaydelegate;

import java.io.File;

/**
 * Created by lizhaok on 2016/11/19.
 */
public class FileSystemEntity {
    private File file;

    public File createFile() {
        file = new File("hi");
       return file;
    };

    public void deleteFile() {
        file.delete();
    }
}
