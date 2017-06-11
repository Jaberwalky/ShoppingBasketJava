import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class ShoppingBasketTest {

  ShoppingBasket basket;
  Item item;

  @Before
  public void before(){
    basket = new ShoppingBasket();
    item = new Item();
  }

  @Test
  public void basketStartsOutEmpty(){
      assertEquals(0, basket.numberOfItems());
  }

  @Test
  public void canAddItemToBasket(){
    basket.addItem(item);
    assertEquals(1, basket.numberOfItems());
  }

  @Test
  public void canRemoveItemFromBasket(){
    basket.addItem(item);
    assertEquals(item, basket.removeItem());
    assertEquals(0, basket.numberOfItems());
  }

  @Test
  public void canEmptyBasket(){
    basket.addItem(item);
    basket.addItem(item);
    basket.empty();
    assertEquals(0, basket.numberOfItems());
  }


}