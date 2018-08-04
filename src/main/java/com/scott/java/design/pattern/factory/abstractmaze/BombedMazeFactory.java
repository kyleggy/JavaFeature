package com.scott.java.design.pattern.factory.abstractmaze;

import com.scott.java.design.pattern.maze.BombedWall;
import com.scott.java.design.pattern.maze.Room;
import com.scott.java.design.pattern.maze.RoomWithABomb;
import com.scott.java.design.pattern.maze.Wall;

/**
 * Created by lizhaok on 5/4/2015.
 */
public class BombedMazeFactory extends MazeFactory {


    @Override
    public Room makeRoom(int roomNumber) {
        return new RoomWithABomb(roomNumber);
    }

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }


}
