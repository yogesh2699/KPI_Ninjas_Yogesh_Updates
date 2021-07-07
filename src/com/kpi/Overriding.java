package com.kpi;

/* Parent Class */
class Dog{
    public void bark(){
        System.out.println("woof ");
    }
}
/* Child Class */
class Hound extends Dog{
    public void sniff(){
        System.out.println("sniff ");
    }

    public void bark(){
        System.out.println("bowl");
    }
}
public class Overriding {
    public static void main(String [] args){
        Dog dog = new Hound();
        dog.bark();
    }
}
