package com.example.turtle.command;
import com.example.turtle.Turtle;


public class TraceCommand implements Command {
    private final double dist;
    public TraceCommand(double d) { dist = d; }
    @Override public void execute(Turtle t) { t.trace(dist); }
    @Override public void undo(Turtle t) {
        // To undo drawing, we simply move back without drawing.
        t.getPen().up();
        t.move(-dist);
        t.getPen().down();
    }
}
