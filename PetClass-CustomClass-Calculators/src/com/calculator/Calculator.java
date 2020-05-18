package com.calculator;


import static java.lang.StrictMath.exp;

public class Calculator {

    public static void main(String[] args) {

        // Instantiating the calculator Class to perform predetermine operations
        Calculator calc = new Calculator();

        // call add method and prints the result
        calc.add(5,5);

        // call subtract method and prints the result
        calc.subtract(5,5);

        // call multiply method and prints the result
        calc.multiply(5, 5);

        // calls divide method and prints the result
        calc.divide(5, 5);

        // calls square method and prints the result
        calc.square(5);

    }

    // **add** method takes two integers and adds them
    public int add(int a, int b) {
        System.out.printf("\n%d + %d = %d ", a, b, a+b );
        return a + b;
    }

    // **subtraction** method takes two integers and subtracts them
    public int subtract(int a, int b) {
        System.out.printf("\n%d - %d = %d ", a, b, a-b );
        return a - b;
    }

    // **multiplication** method takes two integer and multiplies them
    public int multiply(int a, int b) {
        System.out.printf("\n%d * %d = %d ", a, b, a*b);
        return a * b;
    }

    // **division** method takes two integer and divides them
    public int divide(int a, int b) {
        System.out.printf("\n%d / %d = %d ", a, b , a/b );
        return a / b;
    }

    // **square** method takes one integer and squares it
    public int square(int a) {
        System.out.printf("\n%d * %d = %d ", a,  a, a*a );
        return a*a;
    }

}