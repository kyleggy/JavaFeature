package com.scott.java.design.pattern.builder.buildermaze;

import com.scott.java.design.pattern.maze.Maze;

/**
 * Created by lizhaok on 5/13/2015.
 */
public class CountingMazeBuilder implements MazeBuilder {
    private int roomNum, doorNum;

    public CountingMazeBuilder() {
        roomNum = 0;
        doorNum = 0;
    }

    @Override
    public void BuildMaze() {

    }

    @Override
    public void BuildRoom(int roomNumber) {
        roomNum ++;

    }

    @Override
    public void BuildDoor(int roomFrom, int rootTo) {
        doorNum ++;

    }

    @Override
    public Maze getMaze() {
        return null;
    }

    public void getCount() {
        System.out.print("Room number is" + roomNum);
        System.out.print("Door number is" + doorNum);
    }
}
