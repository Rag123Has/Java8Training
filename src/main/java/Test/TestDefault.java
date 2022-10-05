package main.java.Test;

public class TestDefault implements Left,Right {
    public void m1()
    {
        Left.super.m1();
        Right.super.m1();
    }

    public static void main(String[] args)
    {
        TestDefault t = new TestDefault();
        t.m1();

    }
}
