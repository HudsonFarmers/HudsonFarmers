package com.zipcodewilmington.froilansfarm.farmtests;

import com.zipcodewilmington.froilansfarm.Animal.animals.Chicken;
import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ChickenCoopTest {

    @Test
    public void testInheritanceOfArrayList(){
        // Give
        ChickenCoop cc = new ChickenCoop();

        Assert.assertTrue(cc instanceof ArrayList);
    }
}
