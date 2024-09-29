package org.example;

import java.awt.*;

public class Application {
    private WinButton winButton;
    private MacButton macButton;
    private WinCheckBox winCheckBox;
    private MacCheckBox macCheckBox;

    public Application(String osType) {
        if (osType.equalsIgnoreCase("Windows")) {
            winButton = new WinButton();
            winCheckBox = new WinCheckBox();
        } else if (osType.equalsIgnoreCase("Mac")) {
            macButton = new MacButton();
            macCheckBox = new MacCheckBox();
        } else {
            throw new IllegalArgumentException("Unknown OS type");
        }
    }

    public void paint() {
        if (winButton != null) {
            winButton.render();
            winCheckBox.render();
        } else if (macButton != null) {
            macButton.render();
            macCheckBox.render();
        }
    }
}
