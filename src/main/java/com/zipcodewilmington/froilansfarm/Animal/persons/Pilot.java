package com.zipcodewilmington.froilansfarm.Animal.persons;


import com.zipcodewilmington.froilansfarm.Vehicle.AirCraft;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Rideable;
import com.zipcodewilmington.froilansfarm.edible.Edible;

public class Pilot<T extends AirCraft> extends Person implements Rider<T> {
    @Override
    public String makeNoise() {
        return "idk, im pilot?";
    }

//    @Override
//    public boolean mount(CropDuster cropDuster) {
//        if (!cropDuster.isMounted()) {
//            cropDuster.setMounted(true);
//            return true;
//        }
//
//        return false;
//    }
//
//    @Override
//    public boolean dismount(CropDuster cropDuster) {
//        if (cropDuster.isMounted()) {
//            cropDuster.setMounted(false);
//            return true;
//        }
//
//        return false;
//    }

    @Override
    public void eat(Edible food) {

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
