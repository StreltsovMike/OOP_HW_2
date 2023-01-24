package org.example.lesson2.game;

public class Wall extends Parameter {

    public Wall(int parameter) {
        super(parameter);
    }

    public boolean overcome(Jumpable jumpable) {
        int jumpLimit = jumpable.getJumpLimit();
        int height = getParameter();
        return jumpLimit >= height;
    }

}
