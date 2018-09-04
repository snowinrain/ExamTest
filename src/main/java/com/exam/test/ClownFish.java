package com.exam.test;

import com.exam.test.intefaces.Swimable;

public class ClownFish extends Fish implements Swimable{
    public ClownFish() {
        setSize("small");
        setColor("orange");
    }
    
    public void makeJoke() {
        System.out.println("I'm making joke");
    }
}
