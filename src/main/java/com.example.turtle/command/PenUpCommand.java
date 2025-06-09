package com.example.turtle.command;

import com.example.turtle.Turtle;


public class PenUpCommand implements Command {
    @Override
    public void execute(Turtle t) {
        t.getPen().up();
    }

    @Override
    public void undo(Turtle t) {
        // undoing a pen‐up is putting the pen down
        t.getPen().down();
    }
}
