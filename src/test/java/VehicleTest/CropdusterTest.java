package VehicleTest;

import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CropdusterTest {
    @Nested
    class CropDusterTest {

        private CropDuster cropDuster;

        @BeforeEach
        void setUp() {
            cropDuster = new CropDuster();
        }

        @Test
        void testFly() {
            cropDuster.fly();
            assertTrue(cropDuster.isFlying(), "CropDuster should be flying");
        }

        @Test
        void testFertilize() {
            try {
                cropDuster.fertilize();
            } catch (Exception e) {
                fail("Fertilize method threw an exception: " + e.getMessage());
            }
        }

    }
}
