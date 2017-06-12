import java.util.*;

public class BOGOF{

  public static int applyBOGOF(ShoppingBasket basket){
    Map<Purchasable, Integer> occurences = new HashMap<>();  
    for (Purchasable item : basket.getItems()){
      Integer count = occurences.get(item);          
      occurences.put(item, (count==null) ? 1 : count+1);
    }
    int total = 0;
    for (Map.Entry<Purchasable, Integer> entry : occurences.entrySet()){
      Purchasable key = entry.getKey();
      Integer value = entry.getValue();
      if (value <= 2){
        total += key.getPrice();
      } else if (value % 2 == 0){
        total += key.getPrice() * (value / 2);
      } else if (value % 2 == 1){
        total += (key.getPrice() * (value / 2)) + key.getPrice();
      }
    }
    return total;
  }  





}