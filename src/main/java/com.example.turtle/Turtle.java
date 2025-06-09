package com.example.turtle;

public class Turtle {

    private double x = 0, y = 0;
    private double heading = 0; // 0° = east, +° CCW
    private final Pen pen;
    private final Matrix canvas;

    public Turtle(Matrix canvas) {
        this.canvas = canvas;
        this.pen = new Pen();
    }
}
