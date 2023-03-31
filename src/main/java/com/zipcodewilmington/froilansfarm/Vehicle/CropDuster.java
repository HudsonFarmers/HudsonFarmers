package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Field;

public class CropDuster implements Vehicle, AirCraft {
    boolean isMounted;

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
    public String makeNoise() {
        return "BlupBlup";
    }

    public void fly(Field field) {
        for (CropRow cropRow: field)
            for (Crop crop : cropRow) {
                crop.setFertilized(true);
            }
    }
}
