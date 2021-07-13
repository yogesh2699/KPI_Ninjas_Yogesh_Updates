package com.kpi;

abstract class Salary{   //abstract
    int perMonth = 50000;
    int perHour = 2000,amount;
    abstract void calculate();  //abstract method

}
class Monthly extends Salary{
    int noOfMonths;
    Monthly(int month)
    {
        noOfMonths = month;

    }
    void calculate(){ //method overriding
        int amount = noOfMonths * perMonth;
        System.out.println("No of Month" + noOfMonths);
        System.out.println("Total Amount"+amount);
    }
}
class Hourly extends Salary{
    int noOfHours;
    Hourly(int h)
    {
        noOfHours = h;
    }
    void calculate() //method overriding
    {
        int amount = noOfHours * perHour;
        System.out.println("No of Hours:"+noOfHours);
        System.out.println("Total Amount :"+amount);
    }
}
public class Abstraction {
    public static void main(String[] args) {
      Hourly h = new Hourly(1000);
      h.calculate();
      Monthly m = new Monthly(6);
      m.calculate();
    }
}
