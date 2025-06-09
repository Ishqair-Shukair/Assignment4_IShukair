package com.example.turtle;

public class Pen {

    private boolean down = false;
    private DrawingStrategy strategy = new BresenhamStrategy();

    public void up() { down = false; }

    public void down() { down = true; }

    public void setStrategy(DrawingStrategy s) {
        this.strategy = s;
    }
}
