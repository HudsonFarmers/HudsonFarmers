package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.edible.Edible;

public abstract class Crop<TEdible extends Edible> {
    public abstract boolean isFertilized();
    public abstract boolean isHarvested();
    public abstract boolean hasBeenHarvested();
}
