package com.zipcodewilmington.froilansfarm.Animal.persons;

import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.farm.Animal.Person;

public class Pilot<AirCraft> extends Person implements AirLicenseRider {
    @Override
    public String makeNoise() {
        return "idk, im pilot?";
    }
}

// simulation
// new CropDuster
//
// pilot.mount(cropDuster)
//
