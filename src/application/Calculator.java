package application;

import javax.swing.*;

public class Calculator {
    private double numberOne;
    private double numberTwo;
    private JTextField numberOneInput;
    private JTextField numberTwoInput;
    private JComboBox operationComboBox;
    private JButton calculateButton;
    private JButton clearButton;
    private JButton closeButton;

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public double sum(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public double subtract(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    public double divide(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }

    public double multiply(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }
}
