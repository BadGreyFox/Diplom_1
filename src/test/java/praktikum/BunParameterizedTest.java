package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static praktikum.data.Constants.DELTA;
import static praktikum.data.TestData.RANDOM_NAME;
import static praktikum.data.TestData.RANDOM_PRICE;


@RunWith(Parameterized.class)
public class BunParameterizedTest {
    private final String expectedBunName;
    private final float expectedBunPrice;
    private Bun bun;

    public BunParameterizedTest(String expectedBunName, float expectedBunPrice) {
        this.expectedBunName = expectedBunName;
        this.expectedBunPrice = expectedBunPrice;
    }

    @Parameterized.Parameters(name = "Название булочки: {0}, цена: {1}")
    public static Object[][] getDataForBun(){
        return new Object[][]{
                {"black bun", 100f},
                {"white bun", 200f},
                {"red bun", 300f},
                {RANDOM_NAME, RANDOM_PRICE}
        };
    }

    @Before
    public void setUpBun(){
        bun = new Bun(expectedBunName, expectedBunPrice);
    }

    @Test
    public void checkBunName() {
        assertEquals("Названия булочек не совпадает", expectedBunName, bun.getName());
    }

    @Test
    public void checkBunPrice() {
        assertEquals("Цена булочек не совпадает", expectedBunPrice, bun.getPrice(), DELTA);
    }
}
