package com.scott.java.design.pattern.factory.abstractmaze;

import com.scott.java.design.pattern.maze.Maze;
import org.junit.Test;

/**
 * Created by lizhaok on 5/4/2015.
 */
public class TestMazeGame {
    MazeGame mazeGame;
    MazeFactory mazeFactory;

    @Test
    public void testEnchantedMaze() {
        mazeFactory = new EnchantedMazeFactory();
        mazeGame = new MazeGame();
        Maze maze = mazeGame.createMaze(mazeFactory);
        System.out.println(maze.toString());

    }

    @Test
    public void testBombedMaze() {
        mazeFactory = new BombedMazeFactory();
        mazeGame = new MazeGame();
        Maze maze = mazeGame.createMaze(mazeFactory);
        System.out.println(maze.toString());
    }


}
