package com.scott.java.design.pattern.structure.facade.compilesystem.node;


import com.scott.java.design.pattern.structure.facade.compilesystem.codegenerate.CodeGenerator;

/**
 * Created by lizhaok on 2016/12/30.
 */
public interface ProgramNode {

    //program node manipulation
    public void getSourcePosition(int line, int index);

    //child manipulation
    public void add(ProgramNode programNode);

    public void remove(ProgramNode programNode);

    public void traverse(CodeGenerator codeGenerator);

}
