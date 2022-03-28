package com.android.a19110168_calc;

public class Calculator {
    // Available operations
    public enum Operator {ADD, SUB, DIV, MUL, POW, FACTORIAL, LOGARITH}

    /**
     * Addition operation
     */
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Subtract operation
     */
    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Divide operation
     */
    public double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    /**
     * Multiply operation
     */
    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }
    /**
     * Pow operation
     */
    public double pow(double firstOperand, double secondOperand) {
        return Math.pow(firstOperand, secondOperand);
    }
    /**
     * Factorial operation
     */
    public long factorial(int firstOperand) {
        long result = 1;
        if (firstOperand != 0 && firstOperand != 1) {
            for (int i = 2; i <= firstOperand; i++) {
                result *= i;
            }
        }
        if(firstOperand > 20){
            return 0;
        }
        return result;
    }
    /**
     * Logarith operation
     */
    public double logarith(double firstOperand,double secondOperand) {

        return Math.log(secondOperand)/Math.log(firstOperand);
    }


}
