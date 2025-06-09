package com.example.turtle.command;
import com.example.turtle.Turtle;

public interface Command {
    void execute(Turtle t);
    void undo(Turtle t);
}
