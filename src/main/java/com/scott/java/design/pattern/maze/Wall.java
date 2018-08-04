package com.scott.java.design.pattern.maze;

/**
 * Created by lizhaok on 4/20/2015.
 */
public class Wall implements MapSite {

    @Override
    public void enter(Maze maze) {
        System.out.println("Enter Wall");
    }
}
