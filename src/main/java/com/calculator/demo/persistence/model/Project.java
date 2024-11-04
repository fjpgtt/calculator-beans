package com.calculator.demo.persistence.model;

public class Project {
    private int firstNumber;
    private int secondNumber;

    public Project(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Project(Project project) {
        this(project.getFirstNumber(), project.getSecondNumber());
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }
}
