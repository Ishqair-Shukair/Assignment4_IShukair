package com.example.turtle.command;

public class RectangleCommand extends CompositeCommand {
    public RectangleCommand(double w, double h) {
        // assume pen is already down before execution
        add(new TraceCommand(w))
                .add(new TurnCommand(90))
                .add(new TraceCommand(h))
                .add(new TurnCommand(90))
                .add(new TraceCommand(w))
                .add(new TurnCommand(90))
                .add(new TraceCommand(h))
                .add(new TurnCommand(90));
    }
}