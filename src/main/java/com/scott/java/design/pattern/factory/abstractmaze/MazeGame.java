package com.scott.java.design.pattern.factory.abstractmaze;

import com.scott.java.design.pattern.maze.Direction;
import com.scott.java.design.pattern.maze.Door;
import com.scott.java.design.pattern.maze.Maze;
import com.scott.java.design.pattern.maze.Room;

/**
 * Created by lizhaok on 5/4/2015.
 */
public class MazeGame {

    public Maze createMaze(MazeFactory mazeFactory) {
        Maze maze = mazeFactory.makeMaze();
        Room room1 = mazeFactory.makeRoom(1);
        Room room2 = mazeFactory.makeRoom(2);
        Door door = mazeFactory.makeDoor(room1, room2);


        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Direction.North, mazeFactory.makeWall());
        room1.setSide(Direction.East, door);
        room1.setSide(Direction.West, mazeFactory.makeWall());
        room1.setSide(Direction.South, mazeFactory.makeWall());

        room2.setSide(Direction.North, mazeFactory.makeWall());
        room2.setSide(Direction.West, door);
        room2.setSide(Direction.East, mazeFactory.makeWall());
        room2.setSide(Direction.South, mazeFactory.makeWall());

        return maze;
    }
}
