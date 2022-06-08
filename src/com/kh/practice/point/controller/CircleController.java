package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {

    private Circle c;

    public CircleController() {
        c = new Circle();
    }

    public String calcArea(int x, int y, int radius) {
        c.setX(x);
        c.setY(y);
        c.setRadius(radius);
        double area = radius * radius * Math.PI;
        return c.toString() + " / " + area;
    }

    public String calcCircum(int x, int y, int radius) {
        c.setX(x);
        c.setY(y);
        c.setRadius(radius);
        double circum = 2 * Math.PI * radius;
        return c.toString() + " / " + circum;
    }
}
