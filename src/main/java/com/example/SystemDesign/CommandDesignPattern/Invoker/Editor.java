package com.example.SystemDesign.CommandDesignPattern.Invoker;

import com.example.SystemDesign.CommandDesignPattern.Command.Command;

import java.util.Stack;

public class Editor {
    private Stack<Command> lastModification;
    public Editor(){
        this.lastModification = new Stack<>();
    }

    public void executeCommand(Command command){
        command.execute();
        lastModification.push(command);
    }

    public void undo(){
        lastModification.peek().undo();
    }
    public void redo(){
        lastModification.peek().redo();
    }
}
