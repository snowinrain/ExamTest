package com.exam.test;

import com.exam.test.intefaces.Talkable;

class Duck extends Animal implements Talkable {
    public void swim() {
        System.out.println("I'm swimming");
    }

    public void say() {
        System.out.println("Quack, quack");
    }
}