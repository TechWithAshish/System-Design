package com.example.SystemDesign.CommandDesignPattern.Command;

import com.example.SystemDesign.CommandDesignPattern.Receiver.TextDocument;

public class DeleteTextCommand implements Command {
    private final TextDocument textDocument;

    public DeleteTextCommand(TextDocument textDocument) {
        this.textDocument = textDocument;
    }


    @Override
    public void execute() {
        textDocument.deleteText();
    }

    @Override
    public void undo() {
        textDocument.addText();
    }

    @Override
    public void redo() {
        textDocument.deleteText();
    }
}
