package praktikum;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {
    private final String expectedName = RandomStringUtils.randomAlphabetic(9);
    private final float expectedPrice = (float) (Math.random() * 6);
    private Bun bun;
    @Before
    public void setUp(){
         bun = new Bun(expectedName, expectedPrice);
    }
    @Test
    public void testGetName() {
        assertEquals(expectedName, bun.getName());
    }
    @Test
    public void testGetPrice() {
        assertEquals(expectedPrice, bun.getPrice(), 0.001);
    }
}
