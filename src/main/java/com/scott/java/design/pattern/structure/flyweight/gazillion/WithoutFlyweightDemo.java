package com.scott.java.design.pattern.structure.flyweight.gazillion;

/**
 * Created by lizhaok on 12/27/2017.
 */

class Gazillions {
    private static int num = 0;
    private int row, col;

    public Gazillions(int maxPerRow) {
        row = num / maxPerRow;
        col = num % maxPerRow;
        num++;
    }

    void report() {
        System.out.print(" " + row + col);
    }
}

public class WithoutFlyweightDemo {
    public static final int ROWS = 6, COLS = 10;

    public static void main( String[] args ) {
        Gazillions[][] matrix = new Gazillions[ROWS][COLS];
        for (int i=0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                matrix[i][j] = new Gazillions(COLS);
            }
        }
        for (int i=0; i < ROWS; i++) {
            for (int j=0; j < COLS; j++) {
                matrix[i][j].report();
            }
            System.out.println();
        }
    }
}
