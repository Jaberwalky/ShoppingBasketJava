import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class BOGOFTest {

  Item soup;
  Item bread;
  Item salmon;
  ShoppingBasket basket;
  
  @Before
  public void before(){
    soup = new Item("Soup", 129, true);
    bread = new Item("Bread", 135, false);
    salmon = new Item("Salmon", 449, false);
    basket = new ShoppingBasket();
  }

  @Test
  public void canApplyTwoForOneDiscount(){
    basket.addItem(soup);
    basket.addItem(soup);
    assertEquals(129, BOGOF.applyBOGOF(basket));
  }

  @Test
  public void canApplyTwoForOneDiscount_ThirdItem(){
    basket.addItem(soup);
    basket.addItem(soup);
    basket.addItem(bread);
    assertEquals(264, BOGOF.applyBOGOF(basket));
  }

  @Test
  public void canApplyTwoForOneDiscount_MultipleItems(){
    basket.addItem(soup);
    basket.addItem(soup);
    basket.addItem(bread);
    basket.addItem(soup);
    assertEquals(393, BOGOF.applyBOGOF(basket));
  }

  @Test
  public void canApplyTwoForOneDiscount_ShitGettingKerazy(){
    basket.addItem(soup);
    basket.addItem(soup);
    basket.addItem(soup);
    basket.addItem(soup);
    basket.addItem(soup);
    basket.addItem(soup);
    basket.addItem(bread);
    basket.addItem(bread);
    basket.addItem(salmon);
    basket.addItem(salmon);
    basket.addItem(salmon);
    assertEquals(1420, BOGOF.applyBOGOF(basket));
  }


}