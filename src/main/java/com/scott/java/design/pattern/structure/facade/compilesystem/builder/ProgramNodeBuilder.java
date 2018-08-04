package com.scott.java.design.pattern.structure.facade.compilesystem.builder;

import com.scott.java.design.pattern.structure.facade.compilesystem.node.ProgramNode;

/**
 * Created by lizhaok on 2016/12/31.
 */
public interface ProgramNodeBuilder {

    public  ProgramNode newVariable(String variableName);

    public ProgramNode newAssignment(ProgramNode variable, ProgramNode expression);

    public ProgramNode newReturnStatement(ProgramNode value);

    public ProgramNode buildNode();

    public ProgramNode newCondition(ProgramNode condition, ProgramNode truePart, ProgramNode falsePart);

    public ProgramNode getRootNode();

}
