package com.example.turtle.command;
import com.example.turtle.Turtle;

public class ShowCommand {
    @Override public void execute(Turtle t) {
        System.out.print(t.show());
    }
    @Override public void undo(Turtle t) { /* no‐op */ }
}
