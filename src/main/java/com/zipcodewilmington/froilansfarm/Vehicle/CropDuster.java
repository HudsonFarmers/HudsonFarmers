package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Animal.persons.AirLicenseRider;
import com.zipcodewilmington.froilansfarm.Animal.persons.Rider;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Field;

public class CropDuster<T extends AirLicenseRider> implements AirCraft<T>, FarmVehicle {
    private boolean isMounted;

    public CropDuster() {
        this.isMounted = false;
    }

    public boolean isMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }

    @Override
    public boolean fly() {
        return false;
    }


    // when a crop
    @Override
    public boolean operate(Field field) {
        return false;
    }// go thru the crop rows in field and fertilize all crop

    public void fertilize(CropRow cropRow){

    }

    @Override
    public String makeNoise() {
        return "whatever sounds a crop-duster makes";
    }
}
