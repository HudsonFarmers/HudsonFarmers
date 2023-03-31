package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.edible.Produce;

public abstract class Crop<T extends Edible> implements Produce<T> {
    public boolean isFertilized;
    public boolean isHarvested;
    public Crop(){
        this.isFertilized = false;
        this.isHarvested = false;
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
}
