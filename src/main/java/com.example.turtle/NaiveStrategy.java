package com.example.turtle;

public class NaiveStrategy {
    @Override
    public void drawLine(Matrix m, double x0, double y0, double x1, double y1) {
        double dx = x1 - x0, dy = y1 - y0;
        int steps = (int) (Math.max(Math.abs(dx), Math.abs(dy)) * 2);
        for (int i = 0; i <= steps; i++) {
            double t = (double) i / steps;
            double x = x0 + t * dx;
            double y = y0 + t * dy;
            m.setCell((int) y, (int) x, '#');
        }
    }
}