package org.example;

public class Main {
    public static void main(String[] args) {
        Application app = new Application("Windows");
        app.paint(); // Renders Windows UI

        app = new Application("Mac");
        app.paint(); // Renders Mac UI
    }
}