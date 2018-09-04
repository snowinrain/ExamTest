package com.exam.test.intefaces;

public interface Walkable {
    public default void walk() {
        System.out.println("I'm walking");
    }
}
