package com.frank;

import java.util.Stack;

public class ExampleStack {
    private static Stack<String> oldCommands = new Stack<>();
    private static Stack<String> newCommands = new Stack<>();


    public static void undo() {
        if (oldCommands.isEmpty()) {
            System.out.println("Nothing to undo");
        } else {
            newCommands.push(oldCommands.pop());
        }
    }
    public static void redo(){
        if (newCommands.isEmpty()) {
            System.out.println("Nothing to redo");
        } else {
            oldCommands.push(newCommands.pop());
        }
    }

    public static void main(String[] args) {
        oldCommands.push("Draw a Box");
        oldCommands.push("fill in box");
        oldCommands.push("change the color");
        oldCommands.push("draw a circle");
        oldCommands.push("move the circle");

        System.out.println(oldCommands);
        undo();
        System.out.println(oldCommands);
        redo();
        System.out.println(oldCommands);
        redo();

    }



}
