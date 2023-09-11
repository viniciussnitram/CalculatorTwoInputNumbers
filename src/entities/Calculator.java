package entities;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculator extends JDialog {
    private double numberOne;
    private double numberTwo;
    private JLabel labelNumberOne;
    private JLabel labelNumberTwo;
    private JTextField inputNumberOne;
    private JTextField inputNumberTwo;
    private JComboBox comboOperation;
    private JButton calculateButton;
    private JButton clearButton;
    private JButton closeButton;
    private JPanel Calculator;
    private JLabel labelOperation;

    public Calculator() {
        setContentPane(Calculator);
        setModal(true);
        getRootPane().setDefaultButton(closeButton);

        inputNumberOne.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char character = e.getKeyChar();

                if (!Character.isDigit(character)) {
                    e.consume();
                }
            }
        });

        inputNumberTwo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char character = e.getKeyChar();

                if (!Character.isDigit(character)) {
                    e.consume();
                }
            }
        });

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setNumberOne(Double.parseDouble(inputNumberOne.getText()));
                setNumberTwo(Double.parseDouble(inputNumberTwo.getText()));

                switch (comboOperation.getSelectedIndex()) {
                    case 1 -> JOptionPane.showMessageDialog(null, sum(getNumberOne(), getNumberTwo()));
                    case 2 -> JOptionPane.showMessageDialog(null, subtract(getNumberOne(), getNumberTwo()));
                    case 3 -> JOptionPane.showMessageDialog(null, divide(getNumberOne(), getNumberTwo()));
                    case 4 -> JOptionPane.showMessageDialog(null, multiply(getNumberOne(), getNumberTwo()));
                    default -> JOptionPane.showMessageDialog(null, "There is no operation type selected.");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputNumberOne.setText("");
                inputNumberTwo.setText("");
                comboOperation.setSelectedIndex(0);
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onClose();
            }
        });
        inputNumberOne.addKeyListener(new KeyAdapter() {
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

    public void onClose() {
        dispose();
    }
}
