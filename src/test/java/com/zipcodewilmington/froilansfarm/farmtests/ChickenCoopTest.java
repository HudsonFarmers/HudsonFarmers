package com.zipcodewilmington.froilansfarm.farmtests;

import com.zipcodewilmington.froilansfarm.farm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ChickenCoopTest {

    @Test
    public void testInheritanceOfArrayList(){
        // Given
        ChickenCoop cc = new ChickenCoop();

        Assert.assertTrue(cc instanceof ArrayList<Chicken>);
    }
}
