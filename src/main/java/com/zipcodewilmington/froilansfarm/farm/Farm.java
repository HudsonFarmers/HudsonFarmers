package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;

public class Farm {
    private ArrayList<ChickenCoop> chickenCoops;
    private Stable stable;
    private FarmHouse farmhouse;

    // Nullary Constructor
    public Farm(){
        chickenCoop = new ChickenCoop();
        stable = new Stable();
        farmhouse = new FarmHouse();
    }

    // Constructor
    public Farm(Stable stable, ChickenCoop chickenCoop, FarmHouse farmhouse){
        this.stable = stable;
        this.chickenCoop = chickenCoop;
        this.farmhouse = farmhouse;

    }

    public ChickenCoop getChickenCoops() {
        return chickenCoop;
    }

    public void setChickenCoops(ChickenCoop chickenCoop) {
        this.chickenCoop = chickenCoop;
    }

    public Stable getStables() {
        return stable;
    }

    public void setStables(Stable stable) {
        this.stable = stable;
    }

    public FarmHouse getFarmhouse() {
        return farmhouse;
    }

    public void setFarmhouse(FarmHouse farmhouse) {
        this.farmhouse = farmhouse;
    }
}
