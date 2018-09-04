package com.exam.test;

public class Shark extends Fish {
    public Shark() {
        setSize("large");
        setColor("grey");
    }
    
    public void eat() {
        System.out.println("I'm eating other fish");
    }
}
