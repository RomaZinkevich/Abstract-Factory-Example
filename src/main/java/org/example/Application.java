package org.example;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.render();
        checkBox.render();
    }
}
