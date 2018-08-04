package com.scott.java.design.pattern.maze;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizhaok on 4/20/2015.
 */
public class Maze implements Cloneable {
    protected List rooms = new ArrayList();
    protected Dimension dim;
    protected Room curRoom = null;


    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void addRoom(Room room) {
        if (room != null) {
            rooms.add(room);
        }
    }

    public Room findRoom(int roomNumber) {
        for (int i = 0; i < rooms.size(); i++) {
            Room room = (Room) rooms.get(i);
            if (roomNumber == room.getRoomNumber()) {
                return room;
            }
        }
        return null;
    }

    public void setCurrentRoom(int roomNumber) {
        Room room = findRoom(roomNumber);
        setCurrentRoom(room);
    }

    public void setCurrentRoom(Room room) {
        if (room != curRoom) {
            if (curRoom != null) {
                curRoom.setInRoom(false);
            }
            if (room != null) {
                room.setInRoom(true);
                curRoom = room;
            }
        }
    }

    public Room getCurrentRoom() {
        return curRoom;
    }
}
