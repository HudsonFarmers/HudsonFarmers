package com.zipcodewilmington.froilansfarm.farm.Animal;

import com.zipcodewilmington.froilansfarm.NoiseMaker;

public interface Animal extends Eater, NoiseMaker {

    Horse horse = new Horse();
    Chicken chicken = new Chicken();
    Person person= new Person() {
        @Override
        public String makeNoise() {
            return null;
        }
    };
    public abstract String makeNoise();
}
