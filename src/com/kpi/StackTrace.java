package com.kpi;

class b{
    int getDivisionResult(int num,int denm)
    {
        int dv = num/ denm;
        return (dv);
    }
    void showDivisionResult(int num,int denm)
    {
        int res = getDivisionResult(num,denm);
        System.out.println("result="+res);
    }
}
public class StackTrace {
    public static void main(String[] args) {
        b obj = new b();
        System.out.println("Started");
        try{
            obj.showDivisionResult(10,0);
        }catch (ArithmeticException ex)
        {
            ex.printStackTrace();
            System.out.println("Division by zero is not valid");
        }
        System.out.println("Completed");
    }
}
