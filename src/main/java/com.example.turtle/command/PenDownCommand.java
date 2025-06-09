package com.example.turtle.command;

import com.example.turtle.Turtle;

/**
 * Command to lower the pen (start drawing).
 */
public class PenDownCommand implements Command {
    @Override
    public void execute(Turtle t) {
        t.getPen().down();
    }

    @Override
    public void undo(Turtle t) {
        // undoing a pen‐down is lifting the pen
        t.getPen().up();
    }
}
