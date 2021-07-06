package com.kpi;

public class StringExamples {
    public static void main(String[] args) {
        char[] array = { 'K', 'P', 'I', 'N', 'I', 'N','J','A','S',' '};
        String arrayString = new String(array);
        System.out.println( arrayString );

        // 1. length of the array
        System.out.println("Length of character in string is " + arrayString.length());

        // 2. concatenating two strings
        String arrayString2 = "is great company";
        System.out.println(arrayString.concat(arrayString2));

    }
}
