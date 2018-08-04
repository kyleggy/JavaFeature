package com.scott.java.design.pattern.structure.facade.compilesystem.builder;

import com.scott.java.design.pattern.structure.facade.compilesystem.node.ProgramNode;
import com.scott.java.design.pattern.structure.facade.compilesystem.node.StatementNode;

/**
 * Created by lizhaok on 2016/12/31.
 */
public class StatementNodeBuilder implements ProgramNodeBuilder {
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
        programNode = new StatementNode();
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
