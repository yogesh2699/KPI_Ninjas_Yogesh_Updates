package com.kpi;

public class CopyArrays {

    public static void copyElements() {
        int x[] = { 1,2,3,4,5,6,7 };

        int y[] = new int[x.length];

        for (int i = 0; i < x.length; i++)
            y[i] = x[i];

        System.out.println("Contents of array x ");
        for (int i = 0; i < x.length; i++)
            System.out.print(x[i] + " ");

        System.out.println("\n\nContents of array y ");
        for (int i = 0; i < y.length; i++)
            System.out.print(y[i] + " ");
    }

    // using clone method
    public static void cloneMethod()
    {
        int x[] = { 1,2,3,4,5,6,7 };
        int y[] = x.clone();
        System.out.println("Content of array x ");
        for (int i = 0; i < x.length; i++)
            System.out.print(x[i] + " ");

        System.out.println("\n\nContents of array y ");
        for (int i = 0; i < y.length; i++)
            System.out.print(y[i] + " ");
    }

    // using copy using System.arraycopy()
    public static void arrayCopyMethod()
    {
        int x[] = { 1,2,3,4,5,6,7 };
        int y[] = new int[x.length];
        System.arraycopy(x, 0, y, 0, 7);



        System.out.println("Contents of array x ");
        for (int i = 0; i < x.length; i++)
            System.out.print(x[i] + " ");

        System.out.println("\n\nContents of array y ");
        for (int i = 0; i < y.length; i++)
            System.out.print(y[i] + " ");
    }

    public static void main(String[] args) {
        System.out.println("Copy content of on array to another");
        copyElements();
        System.out.println();
        System.out.println("clone Method to copy content of array");
        cloneMethod();
        System.out.println();
        System.out.println("arraycopy Method to copy content of array");
        arrayCopyMethod();
    }

}
