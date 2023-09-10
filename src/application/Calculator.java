package application;

public class Calculator {
    private double numberOne;
    private double numberTwo;

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
