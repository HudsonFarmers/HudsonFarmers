package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;

public class Farm {
    private ChickenCoops chickenCoops;
    private Stables stables;
    private FarmHouse farmhouse;

    // Nullary Constructor
    public Farm(){
        chickenCoops = new ChickenCoops();
        stables = new Stables();
        farmhouse = new FarmHouse();
    }

    // Constructor
    public Farm(Stables stables, ChickenCoops chickenCoops, FarmHouse farmhouse){
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.farmhouse = farmhouse;

    }

    public ChickenCoops getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(ChickenCoops chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public Stables getStables() {
        return stables;
    }

    public void setStables(Stables stables) {
        this.stables = stables;
    }

    public FarmHouse getFarmhouse() {
        return farmhouse;
    }

    public void setFarmhouse(FarmHouse farmhouse) {
        this.farmhouse = farmhouse;
    }
}
