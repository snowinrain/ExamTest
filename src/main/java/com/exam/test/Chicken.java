package com.exam.test;

import com.exam.test.intefaces.Talkable;

class Chicken extends Animal implements Talkable {
    public void say() {
        System.out.println("Cluck, cluck");
    }
}