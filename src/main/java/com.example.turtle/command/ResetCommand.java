package com.example.turtle.command;

import com.example.turtle.Turtle;

/** Clears the canvas and resets the turtle’s position. */
public class ResetCommand implements Command {
    @Override
    public void execute(Turtle t) {
        t.clearAndReset();
    }

    @Override
    public void undo(Turtle t) {
        // optional: you can leave this no‐op or store a snapshot if you want.
    }
}
