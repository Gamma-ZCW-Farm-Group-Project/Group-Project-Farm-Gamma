package FieldTest;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Field.CornStalk;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CornStalkTest {
    private CornStalk cornStalk;

    @BeforeEach
    public void setUp(){
        cornStalk=new CornStalk();
    }
    @Test
    public void testFertilizedAndHarvested(){
        cornStalk.fertilize();
        cornStalk.harvested();

        assertTrue(cornStalk.isFertilized());//cornStalk should be fertilized
        assertTrue(cornStalk.hasBeenHarvested());//cornStalk has been harvested post fertilization
    }
    @Test
    public void testYieldCorn(){
        cornStalk.fertilize();//fertilize corn stalk
        ArrayList<Edible> corn= new ArrayList<>();
        cornStalk.yield(corn);
        assertEquals(1,corn.size());
    }
    @Test
    public void  testHarvested(){
        cornStalk.harvested();
        assertTrue(cornStalk.hasBeenHarvested());
    }
}
