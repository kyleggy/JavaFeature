package com.scott.java.design.pattern.builder.buildermaze;

import com.scott.java.design.pattern.maze.Maze;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lizhaok on 5/5/2015.
 */
public class TestMaze {

    @Test
    public void testBuilder() {
        MazeBuilder mazeBuilder = new StandardMazeBuilder();
        MazeGame mazeGame = new MazeGame(mazeBuilder);
        Maze maze = mazeGame.createMaze();

        Maze maze2 = mazeBuilder.getMaze();
        Assert.assertEquals(maze.findRoom(1).getRoomNumber(), maze2.findRoom(1).getRoomNumber());
    }

    @Test
    public void testCountMazeBuilder() {
        CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
        MazeGame mazeGame = new MazeGame(countingMazeBuilder);
        mazeGame.createMaze();
        countingMazeBuilder.getCount();
        mazeGame.createComplexMaze();
        countingMazeBuilder.getCount();
    }


}
