package com.zipcodewilmington.froilansfarm.Animal.animals;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.farm.Storage;

public interface Animal<T extends Edible> extends Eater<T>, NoiseMaker {

    String makeNoise();
}

// since it is an interface => no need for fields
// override