package org.example.lesson2.game;

public class Cat extends Participant {

    public Cat(String name, int distanceLimit, int jumpLimit, int balanceLimit) {
        super(name, distanceLimit, -1, jumpLimit, balanceLimit);
    }

}