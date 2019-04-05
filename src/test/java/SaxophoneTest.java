import MusicShop.Enums.SaxophoneType;
import MusicShop.Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("Xerus", 400, 500, true, "Gold", "Brass", "Ribbed", SaxophoneType.ALTO);
    }

    @Test
    public void canSetGetManufacturer() {
       saxophone.setManufacturer("Yamaha");
        assertEquals("Yamaha", saxophone.getManufacturer());
    }

    @Test
    public void canAddGetPurchasePrice() {
        saxophone.setPurchasePrice(600);
        assertEquals(600, saxophone.getPurchasePrice(), 0);
    }


}
