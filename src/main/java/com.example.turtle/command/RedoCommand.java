package com.example.turtle.command;
import com.example.turtle.Turtle;
import java.util.Stack;

public class RedoCommand implements Command {
    private final Stack<Command> undoStack;
    private final Stack<Command> redoStack;

    public RedoCommand(Stack<Command> u, Stack<Command> r) {
        this.undoStack = u; this.redoStack = r;
    }

    @Override
    public void execute(Turtle t) {
        if (!redoStack.isEmpty()) {
            Command cmd = redoStack.pop();
            cmd.execute(t);
            undoStack.push(cmd);
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    @Override public void undo(Turtle t) { /* no‐op */ }
}