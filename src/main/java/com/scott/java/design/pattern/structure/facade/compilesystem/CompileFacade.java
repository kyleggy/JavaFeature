package com.scott.java.design.pattern.structure.facade.compilesystem;

import com.scott.java.design.pattern.structure.facade.compilesystem.builder.ProgramNodeBuilder;
import com.scott.java.design.pattern.structure.facade.compilesystem.builder.StatementNodeBuilder;
import com.scott.java.design.pattern.structure.facade.compilesystem.codegenerate.*;
import com.scott.java.design.pattern.structure.facade.compilesystem.codegenerate.CodeGenerator;
import com.scott.java.design.pattern.structure.facade.compilesystem.node.ProgramNode;

import java.io.InputStream;

/**
 * Created by lizhaok on 2016/12/31.
 */
public class CompileFacade {
    private final static CompileFacade compileFacade = new CompileFacade();

    private CompileFacade() {}

    public static CompileFacade getCompileFacadeInstance() {
        return compileFacade;
    }

    public void compile(InputStream inputStream, BytecodeStream byteOutputCodeStream) {
        Scanner scanner = new Scanner(inputStream);
        ProgramNodeBuilder programNodeBuilder = new StatementNodeBuilder();
        Parser parser = new Parser();
        parser.parse(scanner, programNodeBuilder);
        CodeGenerator codeGenerator = new RISCCodeGenerator(byteOutputCodeStream);
        ProgramNode parseTree = programNodeBuilder.getRootNode();
        parseTree.traverse(codeGenerator);
    }
}
