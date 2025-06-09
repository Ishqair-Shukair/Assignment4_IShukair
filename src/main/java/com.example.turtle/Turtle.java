package com.example.turtle;


public class Turtle {

    private double x = 0, y = 0;

    private double heading = 0;

    private final Pen pen;

    private final Matrix canvas;


    public Turtle(Matrix canvas) {
        this.canvas = canvas;
        this.pen    = new Pen();
        this.pen.down();               // begin with pen down
    }


    public Pen getPen()      { return pen; }
    public double getX()     { return x;   }
    public double getY()     { return y;   }
    public double getHeading() { return heading; }


    public void move(double dist) {
        double rad = Math.toRadians(heading);
        double nx  = x + dist * Math.cos(rad);
        double ny  = y + dist * Math.sin(rad);
        pen.up();
        x = nx;
        y = ny;
    }

    public void trace(double dist) {
        double rad = Math.toRadians(heading);
        double nx  = x + dist * Math.cos(rad);
        double ny  = y + dist * Math.sin(rad);
        pen.draw(canvas, x, y, nx, ny);
        x = nx;
        y = ny;
    }

    public void turn(double delta) {
        heading = (heading + delta) % 360;
        if (heading < 0) heading += 360;
    }


    public String show() {
        return canvas.toString();
    }


    public void clearAndReset() {
        canvas.clear();
        x = 0;
        y = 0;
        heading = 0;
        pen.down();         // ensure future trace() calls draw
    }
}
