package com.zipcodewilmington.froilansfarm.Animal.persons;

import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Rideable;

public interface Rider<T extends Rideable> {
    boolean mount(Rideable rideable);
    boolean unMount(Rideable rideable);
}
