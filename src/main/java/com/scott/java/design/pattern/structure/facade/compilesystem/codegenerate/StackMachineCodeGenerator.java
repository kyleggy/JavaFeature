package com.scott.java.design.pattern.structure.facade.compilesystem.codegenerate;

import com.scott.java.design.pattern.structure.facade.compilesystem.BytecodeStream;
import com.scott.java.design.pattern.structure.facade.compilesystem.node.ExpressionNode;
import com.scott.java.design.pattern.structure.facade.compilesystem.node.StatementNode;

/**
 * Created by lizhaok on 2016/12/31.
 */
public class StackMachineCodeGenerator extends CodeGenerator {

    public StackMachineCodeGenerator(BytecodeStream bytecodeStream) {
        super(bytecodeStream);
    }

    @Override
    public void visit(ExpressionNode expressionNode) {

    }

    @Override
    public void visit(StatementNode statementNode) {

    }
}
