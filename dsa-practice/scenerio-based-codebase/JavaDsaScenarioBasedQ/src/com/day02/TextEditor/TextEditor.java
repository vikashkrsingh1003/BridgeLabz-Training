package com.day02.TextEditor;

import java.util.Stack;

public class TextEditor {
    private String text;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public TextEditor() {
        text = "";
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void insert(String newText) {
        undoStack.push(text);
        text += newText;
        redoStack.clear();
    }

    public void delete(int n) {
        if (n > text.length())
            n = text.length();

        undoStack.push(text);
        text = text.substring(0, text.length() - n);
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(text);
            text = undoStack.pop();
        } else {
            System.out.println("Nothing to undo");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(text);
            text = redoStack.pop();
        } else {
            System.out.println("Nothing to redo");
        }
    }

    public void display() {
        System.out.println("Text: " + text);
    }
}
