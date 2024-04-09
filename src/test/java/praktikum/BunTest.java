package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static praktikum.data.Constants.DELTA;
import static praktikum.data.TestData.RANDOM_NAME;
import static praktikum.data.TestData.RANDOM_PRICE;

public class BunTest {
    private final String expectedName = RANDOM_NAME;
    private final float expectedPrice = RANDOM_PRICE;
    private Bun bun;

    @Before
    public void setUpBan() {
        bun = new Bun(expectedName, expectedPrice);
    }

    @Test
    public void checkGetName() {
        assertEquals(expectedName, bun.getName());
    }

    @Test
    public void checkGetPrice() {
        assertEquals(expectedPrice, bun.getPrice(), DELTA);
    }
}
