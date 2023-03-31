package com.zipcodewilmington.froilansfarm.farm.Animal;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.edible.Edible;

public interface Animal<T extends Edible> extends Eater<T>, NoiseMaker {

    String makeNoise();
}

// since it is an interface => no need for fields
// override