package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Edibles.Corn;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HorseTest {

    Horse horse = new Horse();

    @Test
    void checkIfHorseMakesNoise(){
        String expected = "Yee hee hee hee hee hee";

        String actual = horse.makeNoise();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMount(){
        boolean expected = true;
        boolean actual = horse.mount();
        assertTrue(expected, String.valueOf(actual));
    }

    @Test
    void testDismount(){
        boolean expected = true;
        boolean actual = horse.dismount();
        assertTrue(expected, String.valueOf(actual));
    }
    @Test
    public void testEat() {
        Horse horse = new Horse();
        ArrayList<Edible> horseFood = new ArrayList<>();
        Corn corn = new Corn();
        horseFood.add(corn);
        horse.eat(horseFood);
        assertEquals(horseFood.get(0), null);
    }
}
