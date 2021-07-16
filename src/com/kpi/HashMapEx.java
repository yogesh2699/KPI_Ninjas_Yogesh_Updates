package com.kpi;

import java.util.HashMap;
import java.util.Random;

public class HashMapEx {
    public static void main(String[] args) {
        Random rnd = new Random(); // generate random  numbers
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i = 1 ; i<=1000;i++)
        {
            int r = rnd.nextInt(10);  // number having bound value upto 10
            Integer occr = m.get(r);
            if(occr == null)
            {
                occr = 1;
            }else
                occr = occr + 1;
            m.put(r, occr);
        }
        System.out.println(m);
    }
}
