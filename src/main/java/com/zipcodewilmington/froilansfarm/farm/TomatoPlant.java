package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.edible.Tomato;

public class TomatoPlant extends Crop<Tomato> implements Produce{
    @Override
    boolean isFertilized() {
        return false;
    }

    @Override
    boolean setIsHarvested() {
        return false;
    }

    @Override
    boolean getBeenHarvested() {
        return false;
    }
}
