package com.example.makingclasses;

class Arithmetic {
    private int mOperand1;
    private int mOperand2;

    public Arithmetic(){
        mOperand1 = 2;
        mOperand2 = 3;
    }

    public String toString() {
        return "Arithmetic Instance:  mOperand1 = " + mOperand1 + "; mOperand2 = " + mOperand2 + ".";
    }

    public Arithmetic(int operand1, int operand2) {
        this.mOperand1 = operand1;
        this.mOperand2 = operand2;
    }

    public int getOperand1() {
        return mOperand1;
    }

    public void setOperand1(int Operand1) {
        this.mOperand1 = Operand1;
    }

    // add, subtract, mult, divide constructors
    public int add() {
        return mOperand1 + mOperand2;
    }

    public int multiply() {
        return mOperand1 * mOperand2;
    }

    public int subtract() {
        return mOperand1 - mOperand2;
    }

    public double divide() {
        return (float)mOperand2 / mOperand1;
    }



}
