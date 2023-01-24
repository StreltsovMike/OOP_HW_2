package org.example.lesson2.game;

public class SwimmingPool extends Parameter{

    public SwimmingPool(int parameter) {
        super(parameter);
    }

    public boolean overcome(Swimmable swimmable) {
        int swimLimit = swimmable.getSwimLimit();
        int distance = getParameter();
        return swimLimit >= distance;
    }

}
