package com.example.turtle.command;
import com.example.turtle.Turtle;


public class MoveCommand implements Command {
    private final double dist;
    public MoveCommand(double d) { dist = d; }
    @Override public void execute(Turtle t) { t.move(dist); }
    @Override public void undo(Turtle t) { t.move(-dist); }
}
