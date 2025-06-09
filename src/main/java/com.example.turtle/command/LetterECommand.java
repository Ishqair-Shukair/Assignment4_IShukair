package com.example.turtle.command;

public class LetterECommand extends CompositeCommand {
    public LetterECommand() {
        add(new TraceCommand(3))    // top bar
                .add(new TurnCommand(90))
                .add(new TraceCommand(3)) // spine down
                .add(new TurnCommand(-90))
                .add(new TraceCommand(2)) // middle bar
                .add(new PenUpCommand())  // lift pen to move back
                .add(new TurnCommand(180))
                .add(new MoveCommand(2))
                .add(new TurnCommand(-90))
                .add(new PenDownCommand())
                .add(new TraceCommand(3)) // bottom bar
                .add(new TurnCommand(180)); // reset dir
    }
}