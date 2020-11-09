package com.kodilla;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int subtraction(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int add = calc.add(3, 5);
        int subtraction = calc.subtraction(3, 5);
        System.out.println(add);
        System.out.println(subtraction);
    }
}