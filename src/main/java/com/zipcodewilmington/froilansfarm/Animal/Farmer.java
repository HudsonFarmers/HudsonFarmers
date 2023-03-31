package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.VehicleTest.FarmVehicle;
import com.zipcodewilmington.froilansfarm.VehicleTest.Tractor;

public class Farmer implements Rider<Tractor> {

    @Override
    public boolean mount(Tractor tractor) {
        if (!tractor.isMounted()) {
            tractor.setMounted(true);
            return true;
        }

        return false;
    }

    @Override
    public boolean dismount(Tractor tractor) {
        if (tractor.isMounted()) {
            tractor.setMounted(false);
            return true;
        }

        return false;
    }
}
