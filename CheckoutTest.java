import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class CheckoutTest{

  Checkout checkout;
  ShoppingBasket basket;

  @Before
  public void before(){
    checkout = new Checkout();
    basket = new ShoppingBasket(); 
  }

  @Test
  public void canCalulateNonDiscountedTotal(){
    Item item1 = new Item("Soup", 149, false);
    Item item2 = new Item("Bread", 129, false);
    basket.addItem(item1);
    basket.addItem(item2);
    assertEquals(278, checkout.total(basket));

  }



}