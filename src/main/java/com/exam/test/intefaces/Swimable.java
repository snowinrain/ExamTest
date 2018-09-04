package com.exam.test.intefaces;

public interface Swimable {
    public default void swim() {
        System.out.println("I'm swiming");
    }
}
