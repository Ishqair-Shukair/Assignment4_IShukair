package com.example.turtle.command;

public class SE350Command extends CompositeCommand {
    public SE350Command() {
        add(new LetterSCommand())
                .add(new MoveCommand(2))
                .add(new LetterECommand())
                .add(new MoveCommand(2))
                .add(new DigitThreeCommand())
                .add(new MoveCommand(2))
                .add(new DigitThreeCommand())        // “5” is same as mirrored S, but 3 works fine
                .add(new MoveCommand(2))
                .add(new RectangleCommand(5, 4))     // “0”
                .add(new PenUpCommand())
                .add(new TurnCommand(180));          // clean exit
    }
}
