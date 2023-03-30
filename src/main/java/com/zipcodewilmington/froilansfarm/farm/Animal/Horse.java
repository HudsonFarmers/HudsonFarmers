package com.zipcodewilmington.froilansfarm.farm.Animal;

import com.zipcodewilmington.froilansfarm.Animal.persons.Rider;
import com.zipcodewilmington.froilansfarm.Vehicle.Rideable;
import com.zipcodewilmington.froilansfarm.edible.Corn;

public class Horse extends Animal <Corn> implements Rideable {
    Rider rider= new Rider();Corn corn = new Corn();
    public Horse (){
        super();
    }
    @Override
    public String makeNoise(){
        return "NEIGH!";
    }
}
