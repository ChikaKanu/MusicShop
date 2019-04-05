import MusicShop.Enums.GuiterType;
import MusicShop.Instruments.Guiter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuiterTest {

    Guiter guiter;

    @Before
    public void before() {
        guiter = new Guiter("Guiter", 100, 120, true, "wood", 4, GuiterType.ACCUSTIC);
    }

    @Test
    public void canSetGetName() {
        guiter.setName("GermoGuiter");
        assertEquals("GermoGuiter", guiter.getName());
    }

    @Test
    public void canAddGetPurchasePrice() {
        guiter.setPurchasePrice(90);
        assertEquals(90, guiter.getPurchasePrice(), 0);
    }

    @Test
    public void canAddGetSellingPrice() {
        guiter.setSellingPrice(110);
        assertEquals(110, guiter.getSellingPrice(), 0);
    }

    @Test
    public void canSetCheckInStock() {
        guiter.setInStock(false);
        assertEquals(false, guiter.isInStock());
    }

    @Test
    public void canSetGetColour() {
        guiter.setColour("black");
        assertEquals("black", guiter.getColour());
    }

    @Test
    public void canAddGetNoOfStrings() {
        guiter.setNoOfStrings(5);
        assertEquals(5, guiter.getNoOfStrings());
    }

    @Test
    public void canAddGetGuiterType() {
        guiter.setGuiterType(GuiterType.ELECTRIC);
        assertEquals(GuiterType.ELECTRIC, guiter.getGuiterType());
    }

}
