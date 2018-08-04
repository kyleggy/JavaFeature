package com.scott.java.design.pattern.factory.abstractmaze;

import com.scott.java.design.pattern.maze.Door;
import com.scott.java.design.pattern.maze.Maze;
import com.scott.java.design.pattern.maze.Room;
import com.scott.java.design.pattern.maze.Wall;

/**
 * Created by lizhaok on 5/4/2015.
 */
public class MazeFactory {

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







}
