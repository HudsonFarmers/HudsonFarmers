package com.zipcodewilmington.froilansfarm.farmtests;

import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.farm.Stable;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FarmTest {
    @Test
    public void testNullaryConstructor(){
        // Given
        Farm farm = Farm.getInstance();

        // When
        // Then
        Assert.assertNotNull(farm.getChickenCoops());
        Assert.assertNotNull(farm.getStables());
        Assert.assertNotNull(farm.getFarmhouse());
    }

    @Test
    public void testConstructor(){
        // Given
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<>();
        ArrayList<Stable> stables = new ArrayList<>();
        FarmHouse farmHouse = new FarmHouse();
        Farm farm = Farm.getInstance(stables, chickenCoops, farmHouse);

        // When
        // Then
        Assert.assertEquals(chickenCoops,farm.getChickenCoops());
        Assert.assertEquals(stables,farm.getStables());
        Assert.assertEquals(farmHouse,farm.getFarmhouse());
    }

    @Test
    public void testSetChickenCoops(){
        // Given
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<>();
        Farm farm = Farm.getInstance();

        // When
        farm.setChickenCoops(chickenCoops);

        // Then
        Assert.assertEquals(chickenCoops,farm.getChickenCoops());
    }

    @Test
    public void testSetStables(){
        // Given
        ArrayList<Stable> stables = new ArrayList<>();
        Farm farm = Farm.getInstance();

        // When
        farm.setStables(stables);

        // Then
        Assert.assertEquals(stables,farm.getStables());
    }

    @Test
    public void testSetFarmHouse(){
        // Given
        FarmHouse farmHouse = new FarmHouse();
        Farm farm = Farm.getInstance();

        // When
        farm.setFarmhouse(farmHouse);

        // Then
        Assert.assertEquals(farmHouse,farm.getFarmhouse());
    }
}
