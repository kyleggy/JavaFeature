package com.scott.java.design.pattern.factorymethod.mazeabstractmethod;

import com.scott.java.design.pattern.maze.BombedWall;
import com.scott.java.design.pattern.maze.Room;
import com.scott.java.design.pattern.maze.RoomWithABomb;
import com.scott.java.design.pattern.maze.Wall;

/**
 * Created by lizhaok on 6/25/2017.
 */
public class BoombedMazeGame extends MazeGame {

    @Override
    public Room makeRoom(int roomNumber) {
        return new RoomWithABomb(roomNumber);
    }

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }


}
