package com.scott.java.design.pattern.maze;

/**
 * Created by lizhaok on 4/20/2015.
 */
public class Door implements MapSite {
    private Room room1;
    private Room room2;
    private Boolean isOpen;

    public Door (Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    @Override
    public void enter(Maze maze) {
        if (isOpen) {
            Room otherRoom = otherSideFrom(maze.getCurrentRoom());
            if (otherRoom != null) {
                otherRoom.enter(maze);
            }
        } else {
            System.out.println("Ring--someone need to enter the current room");
        }

    }

    public Room otherSideFrom(Room room) {
        if (room != null) {
            if (room == room1) {
                return room2;
            } else if (room == room2) {
                return room1;
            }
        }
        return null;
    }

}
