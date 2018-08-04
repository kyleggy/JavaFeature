package com.scott.java.design.pattern.maze;

/**
 * Created by lizhaok on 4/20/2015.
 */
public class Room implements MapSite {
    int roomNumber;
    MapSite[] sides = new MapSite[4];
    Boolean inRoom;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    };

    Direction direction;

    @Override
    public void enter(Maze maze) {

    }

    public void setSide(Direction direction, MapSite mapSite) {


    };

    public MapSite getSide() {
        return sides[3];
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setInRoom(boolean inRoom) {
        this.inRoom = inRoom;
    }


}
