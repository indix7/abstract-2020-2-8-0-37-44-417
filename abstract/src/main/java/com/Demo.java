package com;

public class Demo {

    public static void main(String[] args) {
        buyChicken();
    }

    public static void buyChicken () {
        Chicken childChicken = new ChildChicken();
        Chicken hen = new Hen();
        Chicken cock = new Cock();
        buyMethod(childChicken);
        buyMethod(hen);
        buyMethod(cock);
    }

    public static void buyMethod (Chicken chicken) {
        System.out.format("100元可以买%s %d只\n", chicken.getType(), (int) (100 / chicken.getPrice()));
    }

}
