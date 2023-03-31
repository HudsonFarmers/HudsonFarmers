package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.farm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.farm.Animal.Person;

public class Farmer extends Person implements Rider<Tractor, Horse>, Botanist {

    @Override
    public boolean mount(Tractor tractor) {
        if (!tractor.isMounted()) {
            tractor.setMounted(true);
            return true;
        }

        return false;
    }

    @Override
    public boolean dismount(Tractor tractor) {
        if (tractor.isMounted()) {
            tractor.setMounted(false);
            return true;
        }

        return false;
    }

    @Override
    public CropRow plant(Crop crop, CropRow cropRow) {
        cropRow.add(crop);
        return cropRow;
    }

    @Override
    public String makeNoise() {
        return "Ah";
    }

    @Override
    public void eat(Edible edible) {

    }
}
