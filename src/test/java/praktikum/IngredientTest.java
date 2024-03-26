package praktikum;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class IngredientTest {

    private static final String expectedName = RandomStringUtils.randomAlphabetic(9);
    private static final float expectedPrice = (float) (Math.random() * 6);
    private Ingredient ingredient;

    @Before
    public void setUp(){
        ingredient = new Ingredient(null, expectedName, expectedPrice);
    }
    @Test
    public void testGetName() {
        assertEquals("Имя не соответствует ожидаемому", expectedName, ingredient.getName());
    }
    @Test
    public void testGetPrice() {
        assertEquals("Цена не соответствует ожидаемому", expectedPrice, ingredient.getPrice(), 0.001);
    }

}