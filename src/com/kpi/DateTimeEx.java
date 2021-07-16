package com.kpi;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeEx {
    public static void main(String[] args) {
        LocalDateTime myObj = LocalDateTime.now(); // set current date time
        System.out.println("Before formatting: "+myObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // format Date & Time

        String formattedDate = myObj.format(myFormatObj); // format method return Date & Time in string format.
        System.out.println("After formatting: " + formattedDate);
    }
}
