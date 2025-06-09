package com.example.turtle.command;

public class DigitThreeCommand extends CompositeCommand {
    public DigitThreeCommand() {
        add(new LetterECommand());
        // flip horizontally: turn & redraw if desired
    }
}