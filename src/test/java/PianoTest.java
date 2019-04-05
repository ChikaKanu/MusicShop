import MusicShop.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Casio",1000, 1400, true, "Metallic", 650, "Weighted_Hammer");
    }

    @Test
    public void canSetGetManufacturer() {
        piano.setManufacturer("Yamaha");
        assertEquals("Yamaha", piano.getManufacturer());
    }

    @Test
    public void canAddGetPurchasePrice() {
        piano.setPurchasePrice(900);
        assertEquals(900, piano.getPurchasePrice(), 0);
    }

    @Test
    public void canAddGetSellingPrice() {
        piano.setSellingPrice(1200);
        assertEquals(1200, piano.getSellingPrice(), 0);
    }

    @Test
    public void canSetCheckInStock() {
        piano.setInStock(false);
        assertEquals(false, piano.isInStock());
    }

}
