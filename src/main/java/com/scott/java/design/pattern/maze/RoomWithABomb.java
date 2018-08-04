package com.scott.java.design.pattern.maze;

/**
 * Created by lizhaok on 5/4/2015.
 */
public class RoomWithABomb extends Room {
    private boolean isBombed;
    public RoomWithABomb(int roomNumber) {
        super(roomNumber);
        this.isBombed = true;
    }
}
