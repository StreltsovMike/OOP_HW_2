package org.example.lesson2.game;

public abstract class Participant implements Runnable, Jumpable, Swimmable, Balancable {

    private final String name;
    private final int distanceLimit;
    private final int swimLimit;
    private final int jumpLimit;
    private final int balanceLimit;

    public Participant(String name, int distanceLimit, int swimLimit, int jumpLimit, int balanceLimit) {
        this.name = name;
        this.distanceLimit = distanceLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
        this.balanceLimit = balanceLimit;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getDistanceLimit() {
        return distanceLimit;
    }

    @Override
    public int getSwimLimit() {
        return swimLimit;
    }

    @Override
    public int getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public int getBalanceLimit() {
        return balanceLimit;
    }
}
