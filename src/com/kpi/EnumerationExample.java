package com.kpi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

class Product{
    int pid;
    float price;
    String name;
    Product(int pid,float price,String name)
    {
        this.pid = pid;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", price=" + price +
                ", name='" + name + '\'' +
                               '}';
    }
}
public class EnumerationExample {
    static void useEnumeration(ArrayList<Product> store)
    {
        Enumeration<Product> enm = Collections.enumeration(store);
        while (enm.hasMoreElements())
        {
            Product p = enm.nextElement();
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        ArrayList<Product> arr = new ArrayList<>();
        arr.add(new Product(101,50000,"Laptop"));
        arr.add(new Product(102,8000000,"Car"));
        arr.add(new Product(103,10000,"Smartphone"));
        EnumerationExample.useEnumeration(arr);
    }
}
