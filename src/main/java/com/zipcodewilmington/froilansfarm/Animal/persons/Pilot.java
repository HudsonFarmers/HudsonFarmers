package com.zipcodewilmington.froilansfarm.Animal.persons;


import com.zipcodewilmington.froilansfarm.Vehicle.AirCraft;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Rideable;
import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Edible;
import com.zipcodewilmington.froilansfarm.farm.Storage;

public class Pilot<T extends AirCraft> extends Person implements AirLicenseRider<T> {
    @Override
    public String makeNoise() {
        return "idk, im pilot?";
    }

    @Override
    public boolean mount(Rideable cropDuster) {
        if (!cropDuster.isMounted()) {
            cropDuster.setMounted(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean disMount(Rideable cropDuster) {
        if (cropDuster.isMounted()) {
            cropDuster.setMounted(false);
            return true;
        }
        return false;
    }
}
