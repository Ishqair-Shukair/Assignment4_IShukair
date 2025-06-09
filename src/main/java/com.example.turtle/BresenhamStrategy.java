package com.example.turtle;

public class BresenhamStrategy implements DrawingStrategy {
    @Override
    public void drawLine(Matrix m, double x0, double y0, double x1, double y1) {
        double dx = Math.abs(x1 - x0);
        int sx = x0 < x1 ? 1 : -1;
        double dy = -Math.abs(y1 - y0);
        int sy = y0 < y1 ? 1 : -1;
        double err = dx + dy;
        double x = x0, y = y0;

        while (true) {
            m.setCell((int) y, (int) x, '#');
            if (x == x1 && y == y1) break;
            double e2 = 2 * err;
            if (e2 >= dy) {
                err += dy;
                x += sx;
            }
            if (e2 <= dx) {
                err += dx;
                y += sy;
            }
        }
    }
}