package application;

import entities.Calculator;

public class Program {
    public static void main(String[] args) {
        Calculator dialog = new Calculator();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
