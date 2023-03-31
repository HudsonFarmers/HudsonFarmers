package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.edible.Produce;

public abstract class Crop<T extends Edible> implements Produce<T> {


    public boolean hasBeenFertilized() {
        return false;
    }

    public abstract T yield();
}
