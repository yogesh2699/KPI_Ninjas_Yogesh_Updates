package com.kpi;

public class Overloading {
    public static void intSquare (int number )
    {
        int square = number * number;
        System.out.println("Method with Integer Argument Called:"+square);

    }
    public static void doubleSquare(double number)
    {
        double square = number * number;
        System.out.println("Method with double Argument Called:"+square);
    }
    public static void longSquare(long number)
    {
        long square = number * number;
        System.out.println("Method with long Argument Called:"+square);
    }
    public static void main(String[] args) {
          intSquare(5);
          doubleSquare(5);
          longSquare(5);
    }
}
