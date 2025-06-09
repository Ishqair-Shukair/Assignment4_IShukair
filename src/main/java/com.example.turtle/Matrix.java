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
