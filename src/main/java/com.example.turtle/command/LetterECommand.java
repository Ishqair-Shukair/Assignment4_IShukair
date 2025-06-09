package com.example.turtle.command;

public class LetterECommand extends CompositeCommand {
    public LetterECommand() {
        add(new PenDownCommand())          // top bar
                .add(new TraceCommand(5))
                .add(new TurnCommand(90))
                .add(new TraceCommand(4))      // down spine
                .add(new TurnCommand(90))
                .add(new TraceCommand(5))      // bottom bar
                .add(new TurnCommand(180))
                .add(new MoveCommand(2))       // up to middle bar start
                .add(new PenDownCommand())
                .add(new TraceCommand(3))      // middle bar
                .add(new PenUpCommand())       // lift pen
                .add(new TurnCommand(180));    // face east again
    }
}
