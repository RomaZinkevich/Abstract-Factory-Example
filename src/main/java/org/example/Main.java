package org.example;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory = new WinFactory();
        Application app = new Application(factory);
        app.paint();

        factory = new MacFactory();
        app = new Application(factory);
        app.paint();
    }
}