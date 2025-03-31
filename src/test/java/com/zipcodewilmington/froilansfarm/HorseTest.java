package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
