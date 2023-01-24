package org.example.lesson2.game;


public class Road extends Parameter { 
 
    public Road(int parameter) {
        super(parameter);
    }

    public boolean overcome(Runnable runnable) {
        int distanceLimit = runnable.getDistanceLimit();
        int parameter = getParameter();
        return distanceLimit >= parameter;
    }

}
