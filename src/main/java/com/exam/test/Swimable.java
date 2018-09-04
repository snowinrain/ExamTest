package com.exam.test;

public interface Swimable {
    public default void swim() {
        System.out.println("I'm swiming");
    }
}
