import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class ItemTest{

  Item item;

  @Before
  public void before(){
    item = new Item("Soup", 149, true);
  }


  @Test
  public void itemHasName(){
    assertEquals("Soup", item.getName());
  }

  @Test
  public void itemHasPrice(){
    assertEquals(149, item.getPrice());
  }

  @Test
  public void canGetPromoStatus(){
    assertEquals(true, item.getPromoStatus());
  }

  @Test
  public void canSetPromoStatus(){
    item.setPromoStatus(false);
    assertEquals(false, item.getPromoStatus());
  }

  @Test
  public void testEqualsComparator(){
    Item item2 = new Item("Soup", 149, true);
    assertEquals(true, item.equals(item2));
  }


}