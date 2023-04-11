package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Egg;
import com.zipcodewilmington.froilansfarm.edible.Tomato;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Egg> eggStorage = new ArrayList<>();
    private static ArrayList<Corn> cornStorage = new ArrayList<>();
    private static ArrayList<Tomato> tomatoStorage = new ArrayList<>();

    public static ArrayList<Egg> getEggStorage() {
        return eggStorage;
    }

    public static ArrayList<Corn> getCornStorage() {
        return cornStorage;
    }

    public static ArrayList<Tomato> getTomatoStorage() {
        return tomatoStorage;
    }
}
