package com.kpi;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SetExample {
    public static void main(String[] args) {

        /*
        Hashset does not maintain the insertion order of elements
        Hashset rely implement hashCode() that is used for hashing to store
        elements and look up speed.
         */
        HashSet<String> S1 = new HashSet<>();
        S1.add("CPP");
        S1.add("JAVA");
        S1.add("SPRING");
        S1.add("PYTHON");
        S1.add("JAVASCRIPT");
        System.out.println("List of All Elements");
        for(String e: S1)
        {
            System.out.println(e);
        }
        /*
        LinkedHashSet Maintain the insertion order of elements.
         */
        LinkedHashSet<String> S2 = new LinkedHashSet<>();
        S2.add("CPP");
        S2.add("JAVA");
        S2.add("SPRING");
        System.out.println("List of All Elements");
        for(String e: S2)
        {
            System.out.println(e);
        }

        S1.retainAll(S2); //  retain all the elements which are present in S2
        System.out.println(S1);
        HashSet<String> S1Copy = new HashSet<>(S1);
        S1Copy.removeAll(S2); // remove all elements which is present in S2 in S1.
        System.out.println(S1Copy);
        System.out.println(S1);

    }
}
