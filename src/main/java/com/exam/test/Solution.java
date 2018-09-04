package com.exam.test;

import java.util.Arrays;
import java.util.List;

import com.exam.test.intefaces.Flyable;
import com.exam.test.intefaces.Swimable;
import com.exam.test.intefaces.Talkable;
import com.exam.test.intefaces.Walkable;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Butterfly()
        };
       
       List<Animal> animalList = Arrays.asList(animals);
       System.out.println(animalList.stream().filter(a -> Flyable.class.isAssignableFrom(a.getClass())).count());
       System.out.println(animalList.stream().filter(a -> Walkable.class.isAssignableFrom(a.getClass())).count());
       System.out.println(animalList.stream().filter(a -> Swimable.class.isAssignableFrom(a.getClass())).count());
       System.out.println(animalList.stream().filter(a -> Talkable.class.isAssignableFrom(a.getClass())).count());
    }
}
