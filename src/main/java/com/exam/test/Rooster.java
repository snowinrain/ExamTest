package com.exam.test;

import com.exam.test.intefaces.Talkable;

class Rooster extends Chicken implements Talkable {
    public void say() {
        System.out.println("Cock-a-doodle-doo");
    }
}