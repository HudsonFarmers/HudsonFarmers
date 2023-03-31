package com.zipcodewilmington.froilansfarm.Animal.persons;

import com.zipcodewilmington.froilansfarm.Vehicle.Rideable;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import com.zipcodewilmington.froilansfarm.farm.Animal.Person;

public class Farmer<T extends Rideable> extends Person implements Botanist, Rider<T> {
    @Override
    public String makeNoise() {
        return "I'm a farmer!";
    }

    @Override
    public boolean mount(T rideable) {
        // set the Rideable object's field to boolean?
        return false;
    }

    @Override
    public boolean unMount(T rideable) {
        // set the Rideable object's field to boolean?
        return false;
    }
}
