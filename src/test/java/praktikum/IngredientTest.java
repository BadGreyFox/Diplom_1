package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static praktikum.data.Constants.DELTA;
import static praktikum.data.TestData.RANDOM_NAME;
import static praktikum.data.TestData.RANDOM_PRICE;

public class IngredientTest {

    private final String expectedName = RANDOM_NAME;
    private final float expectedPrice = RANDOM_PRICE;
    private Ingredient ingredient;

    @Before
    public void setUpIngredient() {
        ingredient = new Ingredient(null, expectedName, expectedPrice);
    }

    @Test
    public void checkGetName() {
        assertEquals("Имя не соответствует ожидаемому", expectedName, ingredient.getName());
    }

    @Test
    public void checkGetPrice() {
        assertEquals("Цена не соответствует ожидаемому", expectedPrice, ingredient.getPrice(), DELTA);
    }

}