package com.zipcodewilmington.froilansfarm.Animal.persons;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;

public interface Botanist {
    CropRow plant(Crop crop, CropRow cropRow);
}
