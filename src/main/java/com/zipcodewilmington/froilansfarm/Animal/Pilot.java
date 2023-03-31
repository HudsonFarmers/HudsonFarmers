package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.farm.Animal.Person;

public class Pilot extends Person implements AirLicenceRider{

    @Override
    public boolean mount(CropDuster cropDuster) {
        if (!cropDuster.isMounted()) {
            cropDuster.setMounted(true);
            return true;
        }

        return false;
    }

    @Override
    public boolean dismount(CropDuster cropDuster) {
        if (cropDuster.isMounted()) {
            cropDuster.setMounted(false);
            return true;
        }

        return false;
    }

    @Override
    public String makeNoise() {
        return "null";
    }

    @Override
    public void eat(Edible edible) {

    }
}
