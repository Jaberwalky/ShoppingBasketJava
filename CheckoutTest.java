import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class CheckoutTest{

  Item soup;
  Item bread;
  Item salmon;
  Item chicken;
  ShoppingBasket basket;
  
  @Before
  public void before(){
    soup = new Item("Soup", 129, true);
    bread = new Item("Bread", 135, false);
    salmon = new Item("Salmon", 449, false);
    chicken = new Item("Roast Chicken", 1500, false);
    basket = new ShoppingBasket();
  }

  @Test
  public void canApply10PercentDiscount(){
    basket.addItem(chicken);
    basket.addItem(salmon);
    basket.addItem(bread);
    
    basket.applyPercentageDiscount();
    assertEquals(1875, BOGOF.applyBOGOF(basket));
  }

}