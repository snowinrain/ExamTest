package com.exam.test;

import com.exam.test.intefaces.Talkable;

public class Parrot extends Animal implements Talkable{
    
    private Talkable talkableThing;
    
    public Parrot(Talkable talkableThing) {
        this.talkableThing = talkableThing;
    }
    
    @Override
    public void say() {
        talkableThing.say();
    }
}
