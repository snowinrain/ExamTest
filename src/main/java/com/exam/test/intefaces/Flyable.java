package com.exam.test.intefaces;

public interface Flyable {
    default void fly() {
        System.out.println("I am flying");
    }
}
