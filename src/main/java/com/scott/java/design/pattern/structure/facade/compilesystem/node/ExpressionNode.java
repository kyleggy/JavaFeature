package com.scott.java.design.pattern.structure.facade.compilesystem.node;

import com.scott.java.design.pattern.structure.facade.compilesystem.codegenerate.CodeGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizhaok on 2016/12/31.
 */
public class ExpressionNode implements ProgramNode {
    private List<ProgramNode> programNodeList = new ArrayList<>();

    @Override
    public void getSourcePosition(int line, int index) {

    }

    @Override
    public void add(ProgramNode programNode) {
        programNodeList.add(programNode);

    }

    @Override
    public void remove(ProgramNode programNode) {
        programNodeList.remove(programNode);
    }

    @Override
    public void traverse(CodeGenerator codeGenerator) {
        codeGenerator.visit(this);


    }
}
