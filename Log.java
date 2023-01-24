package org.example.lesson2.game;

public class Log extends Parameter{

    public Log(int parameter) {
        super(parameter);
    }

    public boolean overcome(Balancable balancable) {
        int balanceLimit = balancable.getBalanceLimit();
        int parameter = getParameter();
        return balanceLimit >= parameter;
    }
}
