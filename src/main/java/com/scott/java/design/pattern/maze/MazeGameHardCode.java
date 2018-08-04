package com.scott.java.design.pattern.maze;

/**
 * Created by lizhaok on 4/20/2015.
 */
public class MazeGameHardCode {

    public Maze createMaze() {
        Maze maze = new Maze();
        Room room1 = new Room(1);
        Room room2 = new Room(2);

        Door theDoor = new Door(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Direction.North, new Wall());
        room1.setSide(Direction.East, theDoor);
        room1.setSide(Direction.South, new Wall());
        room1.setSide(Direction.West, new Wall());

        room2.setSide(Direction.North, new Wall());
        room2.setSide(Direction.East, new Wall());
        room2.setSide(Direction.South, new Wall());
        room2.setSide(Direction.West, theDoor);

        return maze;
    }
}
