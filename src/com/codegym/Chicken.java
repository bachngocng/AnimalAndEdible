package com.codegym;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat(){
        return "fry";
    }
    @Override
    public String toString(){
        return "Chicken";
    }
}
