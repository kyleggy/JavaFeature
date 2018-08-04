package com.scott.java.design.pattern.factorymethod.mazeabstractmethod;

import com.scott.java.design.pattern.maze.*;

/**
 * Created by lizhaok on 6/25/2017.
 */
public class MazeGame {

    public Maze makeMaze() {
        return new Maze();
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Room makeRoom(int roomNumber) {
        return new Room(roomNumber);
    }

    public Door makeDoor(Room room1, Room room2) {
        return new Door(room1, room2);
    }

    public Maze createMaze() {
        Maze maze = makeMaze();
        Room room1 = makeRoom(1);
        Room room2 = makeRoom(2);
        Door door = makeDoor(room1, room2);


        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Direction.North, makeWall());
        room1.setSide(Direction.East, door);
        room1.setSide(Direction.West, makeWall());
        room1.setSide(Direction.South, makeWall());

        room2.setSide(Direction.North, makeWall());
        room2.setSide(Direction.West, door);
        room2.setSide(Direction.East, makeWall());
        room2.setSide(Direction.South, makeWall());

        return maze;
    }
}
