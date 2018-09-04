package com.exam.test;

import com.exam.test.intefaces.Flyable;
import com.exam.test.intefaces.Walkable;

class Bird extends Animal implements Walkable, Flyable{
    
    public void sing() {
        System.out.println("I am singing");
    }
}