package com.example.turtle;

import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixTest {
    @Test
    public void testSetAndToString() {
        Matrix m = new Matrix(3,3);
        m.setCell(1,1,'X');
        String[] lines = m.toString().split("\n");
        assertEquals("X", "" + lines[1].charAt(1));
    }
}