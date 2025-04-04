package FieldTest;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Field.Miscellaneous;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MiscellaneousTest {
    private Miscellaneous miscellaneous;

    @BeforeEach
    public void setUp(){
        miscellaneous=new Miscellaneous();
    }
    @Test
    public void testFertilizedAndHarvested(){
        miscellaneous.fertilize();
        miscellaneous.harvested();

        assertTrue(miscellaneous.isFertilized());//miscellaneous should be fertilized
        assertTrue(miscellaneous.hasBeenHarvested());//miscellaneous has been harvested post fertilization
    }
//    @Test
//    public void testYieldMiscellaneous(){
//        miscellaneous.fertilize();//fertilize corn stalk
//        ArrayList<Edible> edibleList = new ArrayList<>();
//        Miscellaneous.yield(miscellaneous);
//        assertEquals(1,miscellaneous.size());
//    }
@Test
public void  testHarvested(){
    miscellaneous.harvested();
    assertTrue(miscellaneous.hasBeenHarvested());
}
}
