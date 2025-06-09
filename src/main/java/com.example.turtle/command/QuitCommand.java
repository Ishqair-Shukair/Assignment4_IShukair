package com.example.turtle.command;
import com.example.turtle.Turtle;

public class QuitCommand implements Command {
    @Override public void execute(Turtle t) {
        System.out.println("Goodbye!");
        System.exit(0);
    }
    @Override public void undo(Turtle t) { /* no‐op */ }
}
