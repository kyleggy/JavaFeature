package com.scott.java.design.pattern.factory.abstractmaze;

import com.scott.java.design.pattern.maze.Door;
import com.scott.java.design.pattern.maze.DoorNeedSpell;
import com.scott.java.design.pattern.maze.EnchantedRoom;
import com.scott.java.design.pattern.maze.Room;

/**
 * Created by lizhaok on 5/4/2015.
 */
public class EnchantedMazeFactory extends MazeFactory {

    @Override
    public Room makeRoom(int roomNumber) {
        return new EnchantedRoom(roomNumber, 3);
    }

    @Override
    public Door makeDoor(Room room1, Room room2) {
        return new DoorNeedSpell(room1, room2);
    }
}
