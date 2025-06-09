package com.example.turtle.command;
import com.example.turtle.Turtle;
import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    protected final List<Command> children = new ArrayList<>();

    public CompositeCommand add(Command c) {
        children.add(c);
        return this;
    }
}
