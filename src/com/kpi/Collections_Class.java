package com.kpi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collections_Class {

    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("python");
        languages.add("C++");
        languages.add("Go");
        languages.add("JS");
        System.out.println("Unsorted List: "+languages);
        Collections.sort(languages);
        int pos = Collections.binarySearch(languages,"Go");
        System.out.println("Language"+" "+languages.get(pos)+" At "+""+(pos + 2) +" Index");
        Collections.reverse(languages);
        System.out.println("Reverse List: "+languages);
        Collections.shuffle(languages);
        System.out.println("Shuffle List: "+languages);
        Collections.swap(languages,1,3);
    }
}
