package com.scott.java.design.pattern.structure.facade.compilesystem.builder;

import com.scott.java.design.pattern.structure.facade.compilesystem.node.ExpressionNode;
import com.scott.java.design.pattern.structure.facade.compilesystem.node.ProgramNode;

/**
 * Created by lizhaok on 2016/12/31.
 */
public class ExpressionNodeBuilder implements ProgramNodeBuilder {
    private ProgramNode programNode;

    @Override
    public ProgramNode newVariable(String variableName) {
        return null;
    }

    @Override
    public ProgramNode newAssignment(ProgramNode variable, ProgramNode expression) {
        return null;
    }

    @Override
    public ProgramNode newReturnStatement(ProgramNode value) {
        return null;
    }

    @Override
    public ProgramNode buildNode() {
        programNode = new ExpressionNode();
        return programNode;
    }

    @Override
    public ProgramNode newCondition(ProgramNode condition, ProgramNode truePart, ProgramNode falsePart) {
        return null;
    }

    @Override
    public ProgramNode getRootNode() {
        return programNode;
    }
}
