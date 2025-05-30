package com.example.SystemDesign.CommandDesignPattern.Command;

import com.example.SystemDesign.CommandDesignPattern.Receiver.TextDocument;

public class InsertTextCommand implements Command{
    private final TextDocument textDocument;

    public InsertTextCommand(TextDocument textDocument) {
        this.textDocument = textDocument;
    }

    @Override
    public void execute() {
        textDocument.addText();
    }

    @Override
    public void undo() {
        textDocument.deleteText();
    }

    @Override
    public void redo() {
        textDocument.addText();
    }
}
