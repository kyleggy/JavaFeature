package com.scott.java.design.pattern.builder.buildermaze;

import com.scott.java.design.pattern.maze.*;

/**
 * Created by lizhaok on 5/5/2015.
 */
public class StandardMazeBuilder implements MazeBuilder {

    private Maze currentMaze;

    public StandardMazeBuilder() {

    }

    @Override
    public void BuildMaze() {
        currentMaze = new Maze();
    }

    @Override
    public void BuildRoom(int roomNumber) {
        if (currentMaze.findRoom(roomNumber) == null) {
            Room room = new Room(roomNumber);

            room.setSide(Direction.North, new Wall());
            room.setSide(Direction.South, new Wall());
            room.setSide(Direction.West, new Wall());
            room.setSide(Direction.East, new Wall());
            currentMaze.addRoom(room);

        }

    }

    @Override
    public void BuildDoor(int roomFrom, int roomTo) {
        Room room1 = currentMaze.findRoom(roomFrom);
        Room room2 = currentMaze.findRoom(roomTo);
        Door door = new Door(room1, room2);

        room1.setSide(commonWall(room1, room2), door);
        room2.setSide(commonWall(room1, room2), door);

    }

    @Override
    public Maze getMaze() {
        return currentMaze;
    }

    private Direction commonWall(Room room1, Room room2) {
        Direction direction;
        direction = Direction.North;
        return direction;

    }
}
