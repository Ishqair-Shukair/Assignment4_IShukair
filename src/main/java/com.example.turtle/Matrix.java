package com.example.turtle;

public class Matrix {

    private final int rows;
    private final int cols;
    private final char[][] grid;


    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        grid = new char[rows][cols];
        clear();
}

    public void clear() {
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                grid[r][c] = ' ';
    }

    public void setCell(int r, int c, char ch) {
        if (r >= 0 && r < rows && c >= 0 && c < cols)
            grid[r][c] = ch;
    }
}
