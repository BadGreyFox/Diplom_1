package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTypeParameterizedTest {
    private final String expectedType;

    public IngredientTypeParameterizedTest(String expectedType) {
        this.expectedType = expectedType;
    }

    @Parameterized.Parameters(name = "Тестовые данные: тип соуса: {0}")
    public static Object[][] getIngredientType() {
        return new Object[][]{
                {"SAUCE"},
                {"FILLING"}
        };
    }

    @Test
    public void checkIngredientType() {
        assertEquals("Тип ингредиента не соответствует ожидаемому",
                expectedType,
                IngredientType.valueOf(expectedType).toString()
        );
    }
}
