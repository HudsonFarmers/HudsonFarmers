package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.farm.Animal.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class Animal {
        @Test
        public void testAnimal() {
            Chicken chicken = new Chicken();
            Corn corn = new Corn ();
            chicken.eat(corn);

            Boolean expected = true;
            Boolean actual = chicken.hasEaten(corn);

            Assert.assertEquals(expected, actual);


        }
}
