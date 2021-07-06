package com.kpi;

public class Car {
    String model;
    String color;
    String brand;
    int Speed = 0;
    Car(String model, String color, String brand)
    {
        this.model = model;
        this.color = color;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public void setSpeed(int x)
    {
        this.Speed = x;
    }

   public void getSpeed()
   {
       System.out.println("Speed of Car is " + this.Speed);
   }

    public static void main(String[] args) {

        // creating new object of class Car
      Car swift = new Car("Swift","Red","Maruti");
      System.out.println("Brand of Car is "+swift.getBrand());
      System.out.println("Color of Car is "+swift.getColor());
      System.out.println("Model of Car is "+swift.getModel());
      swift.setSpeed(100);
      swift.getSpeed();
    }
}
