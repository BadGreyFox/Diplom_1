package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;
@RunWith(Parameterized.class)
public class IngredientParameterizedTest {
    private final IngredientType expectedType;

    private Ingredient ingredient;

    public IngredientParameterizedTest(IngredientType expectedType) {
        this.expectedType = expectedType;
    }

    @Parameterized.Parameters(name = "Тестовые данные: тип соуса: {0}")
    public static Object[] getIngredientType (){
        return new Object[][]{
                {SAUCE},
                {FILLING}
        };
    }
    @Before
    public void setUp(){
        ingredient = new Ingredient(expectedType, "expectedName", 1.0f);
    }
    @Test
    public void testGetType() {
        assertEquals("Тип ингредиента не соответствует ожидаемому", expectedType, ingredient.getType());
    }
}
