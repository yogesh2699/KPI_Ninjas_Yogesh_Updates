package com.creational.factory;

/* creational Design Pattern : Factory Pattern */

interface Shape {
    void draw();
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
