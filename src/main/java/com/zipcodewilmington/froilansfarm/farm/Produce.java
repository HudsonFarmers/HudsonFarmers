package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.edible.Edible;

public interface Produce <TEdible extends Edible>{
    TEdible yield();  //TODO checks if it is fertilized and harvested then yield object of that crop

}
