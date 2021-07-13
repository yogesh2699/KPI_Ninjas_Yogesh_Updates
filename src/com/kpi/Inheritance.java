package com.kpi;

class Common{
    double PI = 3.14;
    double getSquare(double R)
    {
        return(R*R);
    }
}
class Circle extends Common{
    void area(double R)
    {
        double ar = PI * getSquare(R);
        System.out.println("Area  = "+ ar);
    }
}
class Cylinder extends Common{
    void volume(double r,double h)
    {
        double vol = PI * getSquare(r) * h;
        System.out.println("Volume Of Cylinder  ="+vol);
    }
}
public class Inheritance {
    public static void main(String[] args) {
     Circle c = new Circle();
     c.area(10.5);
     Cylinder cyl = new Cylinder();
     cyl.volume(12.5,7.8);
    }
}
