package application;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JDialog {
    private double numberOne;
    private double numberTwo;
    private JLabel labelNumberOne;
    private JLabel labelNumberTwo;
    private JTextField inputNumberOne;
    private JTextField inputNumberTwo;
    private JComboBox comboBox1;
    private JButton calculateButton;
    private JButton clearButton;
    private JButton closeButton;

    public Calculator() {
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
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

    public static void main(String[] args) {
        Calculator dialog = new Calculator();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
