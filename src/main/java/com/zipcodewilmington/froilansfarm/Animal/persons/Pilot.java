package com.zipcodewilmington.froilansfarm.Animal.persons;

import com.zipcodewilmington.froilansfarm.Vehicle.AirCraft;
import com.zipcodewilmington.froilansfarm.Vehicle.Rideable;
import com.zipcodewilmington.froilansfarm.farm.Animal.Person;

public class Pilot<AirCraft> extends Person implements AirLicenseRider {
    @Override
    public String makeNoise() {
        return "idk, im pilot?";
    }

    @Override
    public boolean mount(Rideable rideable) {
        return false;
    }

    @Override
    public boolean unMount(Rideable rideable) {
        return false;
    }
}

// simulation
// new CropDuster
//
// pilot.mount(cropDuster)
//
