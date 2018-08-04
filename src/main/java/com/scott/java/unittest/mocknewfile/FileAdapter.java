package com.scott.java.unittest.mocknewfile;

import java.io.File;

/**
 * Created by lizhaok on 2016/8/26.
 */
public class FileAdapter {

    public boolean isFileExist() {
        File file = new File("somewhere");
        return file.exists();
    }
}
