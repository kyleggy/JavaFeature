package com.scott.java.design.pattern.maze;

/**
 * Created by lizhaok on 5/4/2015.
 */
public class DoorNeedSpell extends Door implements MapSite {

    public DoorNeedSpell(Room room1, Room room2) {
        super(room1, room2);
    }

    @Override
    public void enter(Maze maze) {
        System.out.println("Door need spell");
    }
}
