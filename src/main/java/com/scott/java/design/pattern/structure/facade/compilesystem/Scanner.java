package com.scott.java.design.pattern.structure.facade.compilesystem;

import javassist.bytecode.Bytecode;

import java.io.InputStream;

/**
 * Created by lizhaok on 2016/12/30.
 */
public class Scanner {
    private InputStream InputStream;

    public Scanner(InputStream inputStream) {
        this.InputStream  = InputStream;
    }

    public Token scan() {
        return new Token();
    }

}
