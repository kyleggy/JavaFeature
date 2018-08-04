package com.scott.java.design.pattern.maze;

/**
 * Created by lizhaok on 5/4/2015.
 */
public class EnchantedRoom extends Room implements MapSite {
    int roomNumber;
    int spell;

    public EnchantedRoom(int roomNumber, int spell) {
        super(roomNumber);
        this.spell = spell;
    }

    @Override
    public void enter(Maze maze) {
        System.out.println("Enter enchanted room");
    }
}
