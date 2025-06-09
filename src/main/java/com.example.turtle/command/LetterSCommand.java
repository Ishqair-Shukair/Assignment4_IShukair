package com.example.turtle.command;

public class LetterSCommand extends CompositeCommand {
    public LetterSCommand() {
        add(new TraceCommand(3))
                .add(new TurnCommand(90))
                .add(new TraceCommand(1))
                .add(new TurnCommand(90))
                .add(new TraceCommand(3))
                .add(new TurnCommand(-90))
                .add(new TraceCommand(1))
                .add(new TurnCommand(-90))
                .add(new TraceCommand(3))
                .add(new TurnCommand(180)); // face original dir
    }
}