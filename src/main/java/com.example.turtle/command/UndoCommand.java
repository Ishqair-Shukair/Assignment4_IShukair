package com.example.turtle.command;
import com.example.turtle.Turtle;
import java.util.Stack;

public class UndoCommand implements Command {
    private final Stack<Command> undoStack;
    private final Stack<Command> redoStack;

    public UndoCommand(Stack<Command> u, Stack<Command> r) {
        this.undoStack = u; this.redoStack = r;
    }

    @Override
    public void execute(Turtle t) {
        if (!undoStack.isEmpty()) {
            Command cmd = undoStack.pop();
            cmd.undo(t);
            redoStack.push(cmd);
        } else {
            System.out.println("Nothing to undo.");
        }
    }

}
