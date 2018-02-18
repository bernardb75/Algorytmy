package Testowanie.UnitTestStageOne;

import Zajecia2701.Fibonacci;

public class Calculator {

    public double addition(double a, double b) {
        return a + b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public boolean even(double a) {
        return a % 2.0 == 0;
    }
    public static int fibonacci(int a) {
        if (a==0) return 0;
        else if(a==1)return 1;
        else return fibonacci(a-1)+fibonacci(a-2);

    }
    public int triples(String input){
        int counter=0;
        char[] inputAsChar=input.toCharArray();
        for (int i = 0; i <inputAsChar.length-2 ; i++) {
            if (inputAsChar[i]==inputAsChar[i+1]&&inputAsChar[i]==inputAsChar[i+2]){
                counter++;
            }
        }return counter;
    }
}
