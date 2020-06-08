package com.calculator;
import java.lang.*;

public class MagicCalculator extends Calculator {

    public static void main(String[] args) {


        // - MagicCalculator inherits from calculator
        Calculator mCalc1= new Calculator();

        MagicCalculator mCalc = new MagicCalculator();

        /// call add method and prints the result
        // System.out.println(mCalc1.add(5,5));
         mCalc1.add(5,5);

        // call subtract method and prints the result
        // System.out.println(mCalc1.subtract(5,5));
         mCalc1.subtract(5,5);

        // call multiply method and prints the result
        // System.out.println(mCalc1.multiply(5, 5));
         mCalc1.multiply(5, 5);

        // calls divide method and prints the result
        // System.out.println(mCalc1.divide(5, 5));
         mCalc1.divide(5, 5);

        // calls sqrRoot method and prints the result
        // System.out.println(mCalc.squared(9));
        mCalc.sqrRoot(9);

        // sin of a number
        // System.out.println(mCalc.trigSin(9));
        mCalc.trigSin(9);

        // cosine of a number.
        // System.out.println(mCalc.trigCos(9));
        mCalc.trigCos(9);

        //  tangent of a number.
        // System.out.println(mCalc.trigTan(20));
        mCalc.trigTan(20);

        //  factorial (!) of the number
        // System.out.println(mCalc.fact(9));
        mCalc.fact(9);

    }

    // Finds the square root of a number
    public double sqrRoot(int a) {
        System.out.printf("\nMath.sqrt() = %.2f", Math.sqrt(a));

        return Math.sqrt(a);

    }

    //  Finds the sin (trigonometry) of a number.
    public double trigSin(int a) {
        System.out.printf("\nMath.sin() =  %f", Math.sin(a));
        return Math.sin(a);
    }

    //  Finds the cosine (trigonometry) of a number.
    public double trigCos(int c) {
        System.out.printf("\nMath.cos() is = %f ", Math.cos(c));

        return Math.cos(c);
    }

    //  Finds the tangent (trigonometry) of a number.
    public double trigTan(int a) {
        System.out.printf("\nMath.tan() =  " + Math.tan(a));
        return Math.tan(a);
    }

    //  Finds the factorial (!) of the number
    public long fact(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        System.out.printf("\nThe factorial of " + n + " is " + fact);
        return fact;

    }
}