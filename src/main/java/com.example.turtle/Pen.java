package com.example.turtle;

public class Pen {

    private boolean down = false;
    private DrawingStrategy strategy = new BresenhamStrategy();

    public void up() { down = false; }

    public void down() { down = true; }

    public void setStrategy(DrawingStrategy s) {
        this.strategy = s;
    }

    public void draw(Matrix m, double x0, double y0, double x1, double y1) {
        if (down) strategy.drawLine(m, x0, y0, x1, y1);
    }

    public boolean isDown() { return down; }
}
