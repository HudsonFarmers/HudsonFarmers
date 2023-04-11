package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.farm.Storage;

public class CornStalk extends Crop<Corn> {

    public Corn yield() {
        Corn corn = new Corn();
        Storage.getCornStorage().add(corn);
        return corn;
    }
}
