package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Animal.persons.Rider;
import com.zipcodewilmington.froilansfarm.farm.Field;

public interface FarmVehicle<T extends Rider> extends Vehicle<T>{
    boolean operate(Field field);
}
