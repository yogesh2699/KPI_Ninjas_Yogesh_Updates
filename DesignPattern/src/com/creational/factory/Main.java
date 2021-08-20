package com.creational.factory;



public class Main {

    public static void main(String[] args)  {
        shapeFactory sf = new shapeFactory();
        Shape c =  sf.getObject("Circle");
        c.draw();
    }
}
