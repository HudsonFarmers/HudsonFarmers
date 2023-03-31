package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Tomato;

public class CornStalk extends Crop<Corn> {
    private boolean isFertilized;
    private boolean isHarvested;

    public Corn yield() {
        return new Corn();
    }
}
