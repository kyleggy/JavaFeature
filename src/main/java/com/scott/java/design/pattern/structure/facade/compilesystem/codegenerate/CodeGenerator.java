package com.scott.java.design.pattern.structure.facade.compilesystem.codegenerate;

import com.scott.java.design.pattern.structure.facade.compilesystem.BytecodeStream;
import com.scott.java.design.pattern.structure.facade.compilesystem.node.ExpressionNode;
import com.scott.java.design.pattern.structure.facade.compilesystem.node.StatementNode;

/**
 * Created by lizhaok on 2016/12/31.
 */
public abstract class CodeGenerator {
    private BytecodeStream bytecodeStream;

    public CodeGenerator(BytecodeStream bytecodeStream) {
        this.bytecodeStream = bytecodeStream;
    }

    public abstract void visit(ExpressionNode expressionNode);

    public abstract void visit(StatementNode statementNode);


}
