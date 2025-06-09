package com.example.turtle;

/**
 * Strategy interface for drawing lines onto a Matrix.
 */
public interface DrawingStrategy {
    /**
     * Draw a line from (x0,y0) to (x1,y1) on the given Matrix.
     */
    void drawLine(Matrix m, double x0, double y0, double x1, double y1);
}
