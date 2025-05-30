package com.example.SystemDesign.CommandDesignPattern;

import com.example.SystemDesign.CommandDesignPattern.Command.Command;
import com.example.SystemDesign.CommandDesignPattern.Command.DeleteTextCommand;
import com.example.SystemDesign.CommandDesignPattern.Command.InsertTextCommand;
import com.example.SystemDesign.CommandDesignPattern.Invoker.Editor;
import com.example.SystemDesign.CommandDesignPattern.Receiver.TextDocument;
import com.example.SystemDesign.SolutionRunner;

public class CommandSolutionRunner implements SolutionRunner {
    @Override
    public void run() {
        TextDocument textDocument = new TextDocument();
        Editor editor = new Editor();
        editor.executeCommand(new InsertTextCommand(textDocument));
        editor.executeCommand(new DeleteTextCommand(textDocument));
        editor.undo();
        editor.redo();
    }
}
