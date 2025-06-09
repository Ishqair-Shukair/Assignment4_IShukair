package com.example.turtle;

import com.example.turtle.command.UndoCommand;
import com.example.turtle.command.RedoCommand;

import com.example.turtle.command.*;
import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Turtle Graphics Editor!");
        Scanner in = new Scanner(System.in);
        Matrix canvas = new Matrix(40, 80);
        Turtle turtle = new Turtle(canvas);

        Stack<Command> undoStack = new Stack<>();
        Stack<Command> redoStack = new Stack<>();

        while (true) {
            System.out.print("> ");
            String line = in.nextLine().trim().toLowerCase();
            String[] tok = line.split("\\s+");
            Command cmd = null;

            try {
                switch (tok[0]) {
                    case "reset":
                              cmd = new ResetCommand();
                              break;
                    case "quit":   cmd = new QuitCommand(); break;
                    case "show":   cmd = new ShowCommand(); break;
                    case "move":   cmd = new MoveCommand(Double.parseDouble(tok[1])); break;
                    case "trace":  cmd = new TraceCommand(Double.parseDouble(tok[1])); break;
                    case "turn":   cmd = new TurnCommand(Double.parseDouble(tok[1])); break;
                    case "undo":   cmd = new UndoCommand(undoStack, redoStack);  break;
                    case "redo":   cmd = new RedoCommand(undoStack, redoStack);  break;
                    case "rect":   cmd = new RectangleCommand(10, 5);            break;
                    case "s":      cmd = new LetterSCommand();                   break;
                    case "e":      cmd = new LetterECommand();                   break;
                    case "3":      cmd = new DigitThreeCommand();                break;
                    case "se350":  cmd = new SE350Command();                     break;
                    default:
                        System.out.println("Unknown command.");
                        continue;
                }
            } catch (Exception ex) {
                System.out.println("Error parsing command.");
                continue;
            }

            cmd.execute(turtle);
            // only record reversible commands
            boolean isMeta = cmd instanceof ShowCommand
                    || cmd instanceof QuitCommand
                    || cmd instanceof UndoCommand
                    || cmd instanceof RedoCommand
                    || cmd instanceof ResetCommand;

            if (!isMeta) {
                undoStack.push(cmd);
                redoStack.clear();
            }
        }
    }
}