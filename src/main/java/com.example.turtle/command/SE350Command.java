package com.example.turtle.command;

public class SE350Command extends CompositeCommand {
    public SE350Command() {
        add(new LetterSCommand())
                .add(new PenUpCommand()).add(new MoveCommand(5)).add(new PenDownCommand())
                .add(new LetterECommand())
                .add(new PenUpCommand()).add(new MoveCommand(5)).add(new PenDownCommand())
                .add(new DigitThreeCommand())
                .add(new PenUpCommand()).add(new MoveCommand(5)).add(new PenDownCommand())
                .add(new RectangleCommand(3,3));
    }
}