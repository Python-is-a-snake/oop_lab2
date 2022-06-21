package com.company;

import java.util.Scanner;

public class configureButtons {


    static void configureButtons() {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose type of button: 1-text,2-symbol");
        int choise = in.nextInt();
        if (choise == 1) {
            renderTextWindow();
        } else if (choise == 2) {
            renderSymbolWindow();
        }
    }

    static void renderTextWindow() {
        Button okButton = createTextButton();
        okButton.render();
    }

    static void renderSymbolWindow() {
        Button okButton = createSymbolButton();
        okButton.render();
    }

    static Button createTextButton() {
        return new textButtons();
    }

    static Button createSymbolButton() {
        return new SymbolButton();
    }

}

