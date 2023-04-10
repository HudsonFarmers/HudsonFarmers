package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.farm.Field;

public interface AirCraft<Pilot> extends Vehicle{
    boolean fly(Field field);
}
