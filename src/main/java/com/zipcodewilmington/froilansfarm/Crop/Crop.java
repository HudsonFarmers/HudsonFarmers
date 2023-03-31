package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Edible;

public abstract class Crop<T extends Edible> {


    public boolean hasBeenFertilized() {
    }

    public T yield() {
    }
}
