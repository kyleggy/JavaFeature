package com.scott.java.design.pattern.prototype.musicscore;

import org.junit.Test;

public class TestGraphic {

    @Test
    public void testGraphic() {

        Tool tool = new GraphicTool(GraphicProtoTypeFactory.getMusicGraphic("Staff"));
        tool.manipulate();

        tool = new GraphicTool(GraphicProtoTypeFactory.getMusicGraphic("WholeNote"));
        tool.manipulate();

        tool = new GraphicTool(GraphicProtoTypeFactory.getMusicGraphic("HalfNote"));
        tool.manipulate();

        tool = new GraphicTool(GraphicProtoTypeFactory.getMusicGraphic("NotExist"));
        tool.manipulate();

    }
}
