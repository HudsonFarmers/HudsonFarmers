package com.zipcodewilmington.froilansfarm.Animal.persons;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmRides;
import com.zipcodewilmington.froilansfarm.Vehicle.Rideable;
import com.zipcodewilmington.froilansfarm.edible.Edible;

public class Farmer<T extends FarmRides> extends Person implements Botanist, Rider<T> {

    @Override
    public String makeNoise() {
        return "I'm a farmer!";
    }

    @Override
    public CropRow plant(Crop crop, CropRow cropRow) {
        return null;
    }

    @Override
    public void eat(Edible food) {

    }

    @Override
    public boolean mount(Rideable rideable) {
        if(!rideable.isMounted()){
            rideable.setMounted(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean disMount(Rideable rideable) {
        if(rideable.isMounted()){
            rideable.setMounted(false);
            return true;
        }
        return false;
    }
}

//public class Farmer implements Rider<Tractor> {
//
//    @Override
//    public boolean mount(Tractor tractor) {
//        if (!tractor.isMounted()) {
//            tractor.setMounted(true);
//            return true;
//        }
//
//        return false;
//    }
//
//    @Override
//    public boolean dismount(Tractor tractor) {
//        if (tractor.isMounted()) {
//            tractor.setMounted(false);
//            return true;
//        }
//
//        return false;
//    }
//}
