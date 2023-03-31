package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.VehicleTest.FarmVehicle;
import com.zipcodewilmington.froilansfarm.VehicleTest.Rideable;

public interface Rider <TRider extends Rideable> {
    boolean mount(TRider Rideable);
    boolean dismount(TRider Rideable);
}
