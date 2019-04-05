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


}
