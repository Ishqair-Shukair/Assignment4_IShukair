package com.example.turtle.command;

import com.example.turtle.Turtle;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Undo the last command by resetting and replaying history.
 */
public class UndoCommand implements Command {
    private final Stack<Command> undoStack;
    private final Stack<Command> redoStack;

    public UndoCommand(Stack<Command> undoStack, Stack<Command> redoStack) {
        this.undoStack = undoStack;
        this.redoStack = redoStack;
    }

    @Override
    public void execute(Turtle t) {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }
        // Pop the last command and stash it for redo
        Command last = undoStack.pop();
        redoStack.push(last);

        // Clear everything and replay remaining commands
        t.clearAndReset();
        for (Command cmd : new ArrayList<>(undoStack)) {
            cmd.execute(t);
        }
    }

    @Override
    public void undo(Turtle t) {
        // If someone wants to “undo the undo,” treat it like a redo
        if (!redoStack.isEmpty()) {
            Command c = redoStack.pop();
            undoStack.push(c);

            t.clearAndReset();
            for (Command cmd : new ArrayList<>(undoStack)) {
                cmd.execute(t);
            }
        } else {
            System.out.println("Nothing to redo.");
        }
    }
}
