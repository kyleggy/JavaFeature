package com.scott.java.design.pattern.builder.builderpattern;

/**
 * Created by lizhaok on 2016/4/8.
 */
public class ProductA implements Product {
    String partOne;
    String partTwo;

    @Override
    public void setPartOne(String partOne) {
        this.partOne = partOne;

    }

    @Override
    public void setPartTwo(String partTwo) {
        this.partTwo = partTwo;
    }

    @Override
    public String getPartOne() {
        return partOne + " from product A";
    }

    @Override
    public String getPartTwo() {
        return partTwo + " from product A";
    }
}
