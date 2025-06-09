package com.example.turtle.command;

public class DigitThreeCommand extends CompositeCommand {
    public DigitThreeCommand() {
        add(new PenDownCommand())
                .add(new TraceCommand(5))      // top bar
                .add(new TurnCommand(90))
                .add(new TraceCommand(2))
                .add(new TurnCommand(90))
                .add(new TraceCommand(5))      // middle bar
                .add(new TurnCommand(-90))
                .add(new TraceCommand(2))
                .add(new TurnCommand(-90))
                .add(new TraceCommand(5))      // bottom bar
                .add(new PenUpCommand())
                .add(new TurnCommand(180));    // face east
    }
}
