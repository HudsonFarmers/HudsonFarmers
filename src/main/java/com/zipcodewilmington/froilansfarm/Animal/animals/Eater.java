package com.zipcodewilmington.froilansfarm.Animal.animals;

import com.zipcodewilmington.froilansfarm.edible.Edible;

public interface Eater <T extends Edible> {
    boolean eat(T food);
}
