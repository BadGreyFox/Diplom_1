package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    @Mock
    private Bun bun;
    @Mock
    private Ingredient sauce;
    @Mock
    private Ingredient filling;

    private final float expectedPrice = 7.0f;
    private final Burger burger = new Burger();

    @Before
    public void setUp(){
        burger.setBuns(bun);
        burger.addIngredient(sauce);
        burger.addIngredient(filling);
    }

    @Test
    public void testGetPrice() {
        setMockPrice();
        assertEquals(expectedPrice, burger.getPrice(), 0.01f);
    }

    @Test
    public void testGetReceipt() {
        String bunName = "Whole Wheat";
        String sauceName = "Ketchup";
        String fillingName = "Lettuce";

        when(bun.getName()).thenReturn(bunName);
        when(sauce.getName()).thenReturn(sauceName);
        when(filling.getName()).thenReturn(fillingName);
        when(sauce.getType()).thenReturn(IngredientType.SAUCE);
        when(filling.getType()).thenReturn(IngredientType.FILLING);

        setMockPrice();

        String expectedReceipt = String.format(
                "(==== %s ====)%n" +
                "= sauce %s =%n" +
                "= filling %s =%n" +
                "(==== %s ====)%n" +
                "%nPrice: %f%n",
                bunName, sauceName, fillingName, bunName, expectedPrice
        );
        assertEquals(expectedReceipt, burger.getReceipt());
    }
    @Test
    public void testRemoveIngredient() {
        burger.removeIngredient(0);
        assertEquals(1, burger.ingredients.size());
    }
    @Test
    public void testMoveIngredient() {
        burger.moveIngredient(0, 1);
        assertEquals(filling, burger.ingredients.get(0));
    }

    public void setMockPrice(){
        when(bun.getPrice()).thenReturn(3.0f);
        when(sauce.getPrice()).thenReturn(0.3f);
        when(filling.getPrice()).thenReturn(0.7f);
    }
}
