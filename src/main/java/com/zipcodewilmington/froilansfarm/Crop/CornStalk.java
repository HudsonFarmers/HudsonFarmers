package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.farm.Storage;

public class CornStalk extends Crop<Corn> {
    private boolean isFertilized;
    private boolean isHarvested;

    public CornStalk() {
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


    public Corn yield() {
        Corn corn = new Corn();
        Storage.getCornStorage().add(corn);
        return corn;
    }
}
