package com.scott.java.design.pattern.factorymethod.mazeabstractmethod;

import com.scott.java.design.pattern.maze.Maze;
import org.junit.Test;

/**
 * Created by lizhaok on 6/25/2017.
 */
public class TestMazeGame {

    @Test
    public void testBoombedMaze() {
        MazeGame mazeGame = new BoombedMazeGame();
        Maze maze = mazeGame.createMaze();
        System.out.println(maze.toString());
    }

    @Test
    public void testEnchangedMaze() {
        MazeGame mazeGame = new EnchantedMazeGame();
        Maze maze = mazeGame.createMaze();
        System.out.println(maze.toString());
    }


}
