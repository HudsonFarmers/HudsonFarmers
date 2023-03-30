package com.zipcodewilmington.froilansfarm.farmtests;

import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.farm.Stable;
import org.junit.Assert;
import org.junit.Test;

public class FarmTest {
    @Test
    public void testNullaryConstructor(){
        // Given
        Farm farm = new Farm();

        // When
        // Then
        Assert.assertNotNull(farm.getChickenCoops());
        Assert.assertNotNull(farm.getStables());
        Assert.assertNotNull(farm.getFarmhouse());
    }

    @Test
    public void testConstructor(){
        // Given
        ChickenCoop chickenCoop = new ChickenCoop();
        Stable stable = new Stable();
        FarmHouse farmHouse = new FarmHouse();
        Farm farm = new Farm(stable, chickenCoop, farmHouse);

        // When
        // Then
        Assert.assertEquals(chickenCoop,farm.getChickenCoops());
        Assert.assertEquals(stable,farm.getStables());
        Assert.assertEquals(farmHouse,farm.getFarmhouse());
    }

    @Test
    public void testSetChickenCoops(){
        // Given
        ChickenCoop chickenCoop = new ChickenCoop();
        Farm farm = new Farm();

        // When
        farm.setChickenCoops(chickenCoop);

        // Then
        Assert.assertEquals(chickenCoop,farm.getChickenCoops());
    }

    @Test
    public void testSetStables(){
        // Given
        Stable stable = new Stable();
        Farm farm = new Farm();

        // When
        farm.setStables(stable);

        // Then
        Assert.assertEquals(stable,farm.getStables());
    }

    @Test
    public void testSetFarmHouse(){
        // Given
        FarmHouse farmHouse = new FarmHouse();
        Farm farm = new Farm();

        // When
        farm.setFarmhouse(farmHouse);

        // Then
        Assert.assertEquals(farmHouse,farm.getFarmhouse());
    }
}
