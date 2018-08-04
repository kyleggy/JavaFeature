package com.scott.java.design.pattern.builder.buildermaze;

import com.scott.java.design.pattern.maze.Maze;

/**
 * Created by lizhaok on 5/4/2015.
 */
public interface MazeBuilder {

    public void BuildMaze();

    public void BuildRoom(int roomNumber);

    public void BuildDoor(int roomFrom, int rootTo);

    public Maze getMaze();

}
