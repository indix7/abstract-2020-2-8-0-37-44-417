package com;

public abstract class Chicken {
    protected static final double CHILD_CHICKEN_PRICE = 1;
    protected static final double COCK_PRICE = 5;
    protected static final double HEN_PRICE = 3;

    public String getType() {
        return getClass().getSimpleName();
    }

    public abstract double getPrice();
}
