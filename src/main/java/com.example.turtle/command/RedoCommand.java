package com.example.turtle.command;

import com.example.turtle.Turtle;
import java.util.List;
import java.util.Stack;

/**
 * Redo the last undone command by resetting and replaying history.
 */
public class RedoCommand implements Command {
    private final Stack<Command> undoStack;
    private final Stack<Command> redoStack;

    public RedoCommand(Stack<Command> undoStack, Stack<Command> redoStack) {
        this.undoStack = undoStack;
        this.redoStack = redoStack;
    }

    @Override
    public void execute(Turtle t) {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
            return;
        }
        Command next = redoStack.pop();
        undoStack.push(next);

        t.clearAndReset();
        // replay every command in the undo history
        for (Command cmd : undoStack) {
            cmd.execute(t);
        }
    }


    @Override
    public void undo(Turtle t) {
        // no-op or mirror undo logic
    }
}
