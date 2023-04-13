package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.edible.Produce;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.farm.Storage;

public class TomatoPlant extends Crop<Tomato> implements Produce<Tomato> {

    public Tomato yield() {
        Tomato t = new Tomato();
        Storage.getTomatoStorage().add(t);
        return t;
    }
}
