package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Field;

public class CropDuster<Pilot> implements AirCraft, FarmVehicle {
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

    @Override
    public boolean operate(Field field) {
        return false;
    }// go thru the crop rows in field and fertilize all crop

    public void fertilize(CropRow cropRow){

    }
}
