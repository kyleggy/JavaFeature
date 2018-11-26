package com.scott.java.design.pattern.prototype.musicscore;

public class GraphicTool implements Tool {
    private Graphic graphic;

    public GraphicTool(Graphic graphic) {
        this.graphic = graphic;

    }

    @Override
    public void manipulate() {
        graphic.draw(new Position(5,6));
    }

}
