package com.scott.java.design.pattern.maze;

/**
 * Created by lizhaok on 5/4/2015.
 */
public class BombedWall extends Wall implements MapSite{


    @Override
    public void enter(Maze maze) {
        System.out.println("Enter Bombed Wall");
    }


}
