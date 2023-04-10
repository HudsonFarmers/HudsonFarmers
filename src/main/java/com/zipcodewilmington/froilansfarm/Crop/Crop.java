package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.edible.Produce;

public abstract class Crop<T extends Edible> implements Produce<T> {

    boolean isFertilized;

    boolean isHarvested;

    public Crop(){
        isFertilized = false;
        isHarvested = false;
    }


    public boolean isFertilized() {
        return isFertilized;
    }

    public void setFertilized(boolean fertilized) {
        isFertilized = fertilized;
    }

    public boolean isHarvested() {
        return isHarvested;
    }

    public void setHarvested(boolean harvested) {
        isHarvested = harvested;
    }

//    public boolean hasBeenFertilized() {
//        return false;
//    }

    public abstract T yield();
}
