package com.kpi;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("Start");
        int dnm = args.length; // initially args[] length is 0
        System.out.println("Number of the command line argument = "+dnm);
        int num = 8;
        try{
         int res = num/dnm;
         System.out.println("result"+res);
        }catch (NullPointerException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Finally executed");
        }
    }
}
