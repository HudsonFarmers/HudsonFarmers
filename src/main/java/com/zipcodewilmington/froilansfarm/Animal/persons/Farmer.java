package com.zipcodewilmington.froilansfarm.Animal.persons;

import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
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
        // adding 5 new instance of crop into cropRow
        for(int i = 0; i < 5; i++){
            cropRow.add(crop instanceof CornStalk? new CornStalk()
                    : new TomatoPlant());
        }
        return cropRow;
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
