package VehicleTest;

import com.zipcodewilmington.froilansfarm.Field.*;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CropdusterTest {
    @Nested
    class CropDusterTest {

        private CropDuster cropDuster;
        private Field field;


        @BeforeEach
        void setUp() {
            cropDuster = new CropDuster();
            field = new Field();

            CropRow cornRow = new CropRow();
            CropRow tomatoRow = new CropRow();


            field.addCropRow(cornRow);
            field.addCropRow(tomatoRow);
        }

        @Test
        public void testMount() {
            CropDuster.mount();
            assertTrue(CropDuster.isMounted(), "The CropDuster should be mounted after calling mount().");
        }

        // Test for dismounting the Tractor
        @Test
        public void testDismount() {
            CropDuster.mount();  // Mount first
            CropDuster.dismount();  // Then dismount
            assertFalse(CropDuster.isMounted());
        }
        @Test
        public void testIsFlying() {
            cropDuster.mount();  // Mount the CropDuster
            boolean flyResult = cropDuster.fly();  // Call fly on the instance

            //  not already flying
            assertTrue(flyResult);

            // now flying
            assertTrue(cropDuster.isFlying());

            // flying
            flyResult = cropDuster.fly();  //  fly again
            assertTrue(flyResult);
        }
    }
}
