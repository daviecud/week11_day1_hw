import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void testVolumeLevel(){
      assertEquals(100, waterBottle.volumeLevel());

    }

    @Test
    public void testDrink(){
        assertEquals(90, waterBottle.lessDrink());
    }

    @Test
    public void testEmptyBottle(){
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void testFillBottle(){
        assertEquals(100, waterBottle.fillBottle());
    }

}
