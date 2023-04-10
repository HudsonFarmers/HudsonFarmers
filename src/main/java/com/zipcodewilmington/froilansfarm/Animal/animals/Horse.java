package com.zipcodewilmington.froilansfarm.Animal.animals;

import com.zipcodewilmington.froilansfarm.Animal.persons.Rider;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmRides;
import com.zipcodewilmington.froilansfarm.Vehicle.Rideable;
import com.zipcodewilmington.froilansfarm.edible.Edible;

public class Horse<Corn extends Edible,T extends Rider> implements FarmRides<T>, Animal<Corn> {
    public Horse (){
        super();
    }
    @Override
    public String makeNoise(){
        return "NEIGH!";
    }

    @Override
    public void eat(Corn food) {

    }
}
