package com.scott.java.design.pattern.factorymethod.figuremanipulator;

import org.junit.Test;

/**
 * Created by lizhaok on 5/22/2017.
 */
public class Client {

    @Test
    public void testFigure() {
        Figure figure = new TextFigure();
        move(figure);

        Figure figureLine = new LineFigure();
        move(figureLine);

    }

    @Test
    public void parameterizedMethod() {
        Figure figure = create(FigureType.Line);
        move(figure);

        Figure figure1 = create(FigureType.Text);
        move(figure1);
    }

    private Figure create(FigureType figureType) {
        if (figureType == FigureType.Text) {
            return new TextFigure();
        } else {
            return new LineFigure();
        }
    }
    private void move(Figure figure) {
        Manipulator manipulator = figure.createManipulator();
        manipulator.downClick();
        manipulator.drag();
        manipulator.upClick();
    }
}
