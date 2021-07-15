package com.kpi;

import java.util.*;

class  ArrayListProgram{
    public void learnArrayList()
    {
        int MAX = 10;
        int counter = 0;
        List<Object> listA = new ArrayList<>();
        List<Object> listB = new ArrayList<>();
        System.out.println("Storing 9 Integer Objects");
        for (int i = 0;i<MAX - 1;i++)
        {
            listA.add(new Integer(i));
        }
        System.out.println("Storing String");
        listA.add("A");
        listA.add("B");
        listA.add("C");
        listA.add("D");
        System.out.println("Retrive Object using Iterator");
        Iterator<Object> i = listA.iterator();
        while (i.hasNext())
        {
            Object ob = i.next();
            System.out.print(ob+" , ");
        }
        int loc  = listA.indexOf("C");
        System.out.println("Index of A is "+loc);
        List<Object> listSub = listA.subList(10,listA.size());
        System.out.println("New Sublist "+ listSub);
        //Collections reverse
        Collections.reverse(listSub);
        System.out.println("New Reversed List :"+listSub);

        //Collections shuffle
         Collections.shuffle(listSub);
        System.out.println("Shuffled List :"+listSub);


        //Collections swap
        Collections.swap(listSub,1,2);
        System.out.println("After Swap List :"+listSub);
    }

}




public class Collection_ArrayList {
    public static void main(String[] args) {
        ArrayListProgram listExample = new ArrayListProgram();
        listExample.learnArrayList();
    }
}
