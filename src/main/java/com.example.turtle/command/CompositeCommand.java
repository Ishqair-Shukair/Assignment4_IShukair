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
    @Override
    public void execute(Turtle t) {
        for (Command c : children) {
            c.execute(t);
        }
    }
    @Override
    public void undo(Turtle t) {
        for (int i = children.size() - 1; i >= 0; i--) {
            children.get(i).undo(t);
        }
    }
}
