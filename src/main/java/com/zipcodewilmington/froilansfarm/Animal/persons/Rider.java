package com.zipcodewilmington.froilansfarm.Animal.persons;

import com.zipcodewilmington.froilansfarm.Vehicle.Rideable;

public interface Rider <T extends Rideable> {
    boolean mount(T rideable);
    boolean unMount(T rideable);
}
