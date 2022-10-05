package main.java.Test;

public class Student {
    private String name;
    private int marks;

    public Student(String name, Integer marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public String getName() { return this.name; }

    public Integer getMarks() { return this.marks; }
    // override toString method
    public String toString()
    {
        return this.name + ": " + marks;
    }
}
