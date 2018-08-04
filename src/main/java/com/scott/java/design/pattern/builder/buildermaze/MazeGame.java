package com.scott.java.design.pattern.builder.buildermaze;

import com.scott.java.design.pattern.maze.Maze;

/**
 * Created by lizhaok on 5/4/2015.
 */
public class MazeGame {

    private MazeBuilder mazeBuilder;

    public MazeGame(MazeBuilder mazeBuilder) {
        this.mazeBuilder = mazeBuilder;
    }

    public Maze createMaze() {
        mazeBuilder.BuildMaze();
        mazeBuilder.BuildRoom(1);
        mazeBuilder.BuildRoom(2);
        mazeBuilder.BuildDoor(1, 2);
        return mazeBuilder.getMaze();
    }

    public Maze createComplexMaze() {
        mazeBuilder.BuildMaze();
        for (int i = 1; i <= 100; i ++) {
            mazeBuilder.BuildRoom(i);
            if (i < 100) {
                mazeBuilder.BuildDoor(i, i +1);
            }
        }

        return mazeBuilder.getMaze();

    }
}
