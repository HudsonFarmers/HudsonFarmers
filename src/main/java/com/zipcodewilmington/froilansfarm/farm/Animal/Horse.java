package com.zipcodewilmington.froilansfarm.farm.Animal;

import com.zipcodewilmington.froilansfarm.Animal.persons.Rider;
import com.zipcodewilmington.froilansfarm.Vehicle.Rideable;
import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Edible;

public class Horse<Corn extends Edible,T extends Rider> implements Rideable<T>, Animal<Corn> {
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
