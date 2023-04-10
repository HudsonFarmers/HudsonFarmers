package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.edible.Produce;
import com.zipcodewilmington.froilansfarm.edible.Tomato;

public class TomatoPlant extends Crop<Tomato> implements Produce<Tomato> {

    public Tomato yield() {
        return new Tomato();
    }
}
