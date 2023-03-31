package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;

public class Farm {
    public static final Farm FARM = new Farm();
    private ArrayList<ChickenCoop> chickenCoops;
    private ArrayList<Stable> stables;
    private FarmHouse farmhouse;

    // Get instance of Farm
    public static Farm getInstance(){
        return FARM;
    }

    public static Farm getInstance(ArrayList<Stable> stables, ArrayList<ChickenCoop> chickenCoops, FarmHouse farmhouse){
        FARM.setStables(stables);
        FARM.setFarmhouse(farmhouse);
        FARM.setChickenCoops(chickenCoops);
        return FARM;
    }

    // Nullary Constructor
    public Farm(){
         this(new ArrayList<Stable>(), new ArrayList<ChickenCoop>(), new FarmHouse());
    }

    // Constructor
    public Farm(ArrayList<Stable> stables, ArrayList<ChickenCoop> chickenCoops, FarmHouse farmhouse){
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.farmhouse = farmhouse;

    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(ArrayList<ChickenCoop> chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public ArrayList<Stable> getStables() {
        return stables;
    }

    public void setStables(ArrayList<Stable> stables) {
        this.stables = stables;
    }

    public FarmHouse getFarmhouse() {
        return farmhouse;
    }

    public void setFarmhouse(FarmHouse farmhouse) {
        this.farmhouse = farmhouse;
    }
}
