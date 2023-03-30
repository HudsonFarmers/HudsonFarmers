package com.zipcodewilmington.froilansfarm.farm.Animal;

import com.zipcodewilmington.froilansfarm.NoiseMaker;

public interface Animal implements Eater, NoiseMaker {

    Horse horse = new Horse();
    Chicken chicken = new Chicken();
    Person person= new Person();
    public abstract String makeNoise();
}
