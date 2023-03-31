package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.farm.Storage;

public class TomatoPlant extends Crop<Tomato> {

    public Tomato yield() {
        Tomato tomato = new Tomato();
        Storage.getTomatoStorage().add(tomato);
        return tomato;
    }
}
