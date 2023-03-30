package com.zipcodewilmington.froilansfarm.farmtests;

import com.zipcodewilmington.froilansfarm.farm.ChickenCoops;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.farm.Stables;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

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
        ChickenCoops chickenCoops = new ChickenCoops();
        Stables stables = new Stables();
        FarmHouse farmHouse = new FarmHouse();
        Farm farm = new Farm(stables, chickenCoops, farmHouse);

        // When
        // Then
        Assert.assertEquals(chickenCoops,farm.getChickenCoops());
        Assert.assertEquals(stables,farm.getStables());
        Assert.assertEquals(farmHouse,farm.getFarmhouse());
    }

    @Test
    public void testSetChickenCoops(){
        // Given
        ChickenCoops chickenCoops = new ChickenCoops();
        Farm farm = new Farm();

        // When
        farm.setChickenCoops(chickenCoops);

        // Then
        Assert.assertEquals(chickenCoops,farm.getChickenCoops());
    }

    @Test
    public void testSetStables(){
        // Given
        Stables stables = new Stables();
        Farm farm = new Farm();

        // When
        farm.setStables(stables);

        // Then
        Assert.assertEquals(stables,farm.getStables());
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
