package com.example.turtle.command;
import com.example.turtle.Turtle;


public class TurnCommand {
    private final double angle;
    public TurnCommand(double a) { angle = a; }
    @Override public void execute(Turtle t) { t.turn(angle); }
    @Override public void undo(Turtle t) { t.turn(-angle); }
}
