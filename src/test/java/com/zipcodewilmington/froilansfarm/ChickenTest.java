package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class ChickenTest {

    Chicken chicken = new Chicken();

    @Test
    void chickenMakeNoiseTest(){
        String expected = "buck buck buckooock!";

        String actual = chicken.makeNoise();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void chickenCanNotYieldEggTest(){
        chicken.fertilize(); //hasBeenFertilized is activated. Chicken can't yield and EdibleEgg.
        ArrayList<Edible> egg = new ArrayList<>();
        chicken.yield(egg);
        assertEquals(0, egg.size());
    }

    @Test
    void chickenYieldEggTest(){ //hasBeenFertilized must be false for Chicken to yield and EdibleEgg.
        ArrayList<Edible> egg = new ArrayList<>();
        chicken.yield(egg);
        assertEquals(1, egg.size());
    }
}
