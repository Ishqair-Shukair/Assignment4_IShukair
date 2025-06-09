package com.example.turtle;

import org.junit.Test;
import static org.junit.Assert.*;

public class StrategyTest {
    @Test
    public void testBresenham() {
        Matrix m = new Matrix(5,5);
        new BresenhamStrategy().drawLine(m, 0,0,4,4);
        assertEquals('#', m.toString().split("\n")[4].charAt(4));
    }

    @Test
    public void testNaive() {
        Matrix m = new Matrix(5,5);
        new NaiveStrategy().drawLine(m, 0,4,4,0);
        assertEquals('#', m.toString().split("\n")[0].charAt(4));
    }
}
