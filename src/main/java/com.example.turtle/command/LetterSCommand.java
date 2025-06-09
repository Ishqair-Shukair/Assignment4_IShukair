package com.example.turtle.command;

public class LetterSCommand extends CompositeCommand {
    public LetterSCommand() {
        add(new PenDownCommand())          // ensure we’re drawing
                .add(new TraceCommand(5))      // top bar (east)
                .add(new TurnCommand(90))
                .add(new TraceCommand(2))      // down
                .add(new TurnCommand(90))
                .add(new TraceCommand(5))      // middle bar (west)
                .add(new TurnCommand(-90))
                .add(new TraceCommand(2))      // down
                .add(new TurnCommand(-90))
                .add(new TraceCommand(5))      // bottom bar (east)
                .add(new PenUpCommand())       // leave pen up
                .add(new TurnCommand(180));    // face east again
    }
}
