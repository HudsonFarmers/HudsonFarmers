package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.VehicleTest.AirCraft;
import com.zipcodewilmington.froilansfarm.VehicleTest.CropDuster;

public class Pilot implements Rider<CropDuster>{

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
}
