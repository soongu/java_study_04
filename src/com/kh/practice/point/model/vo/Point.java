package com.kh.practice.point.model.vo;

public class Point extends Object {

    private int x;
    private int y;

    public Point() { // No args

    }

    public Point(int x, int y) { // All args
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return String.format("x: %d, y: %d", x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
