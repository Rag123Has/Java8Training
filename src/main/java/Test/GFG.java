package main.java.Test;

import java.util.Map;
import java.util.TreeMap;

public class GFG {

    public static void main(String[] args)
    {

        // New TreeMap of custom class Student
        TreeMap<Student, Integer> map
                = new TreeMap<>(new AccordingMarks());

        // Add elements to TreeMap
        map.put(new Student("Akshay", 400), 1);
        map.put(new Student("Bina", 500), 2);
        map.put(new Student("Chintu", 300), 3);

        System.out.println(
                "TreeMap Keys sorted in descending order of the marks: ");

        // Print map using Entry
        for (Map.Entry<Student, Integer> entry :
                map.entrySet()) {
            System.out.println("Key : (" + entry.getKey()
                    + "), Value : "
                    + entry.getValue());
        }
}}
