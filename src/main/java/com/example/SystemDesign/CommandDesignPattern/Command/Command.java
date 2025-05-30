package com.example.SystemDesign.CommandDesignPattern.Command;

public interface Command {
    void execute();
    void undo();
    void redo();
}
