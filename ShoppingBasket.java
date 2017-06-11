import java.util.ArrayList;

public class ShoppingBasket {


    private ArrayList<Item> basket;

    public ShoppingBasket(){
        this.basket = new ArrayList<>();
    }


    public int numberOfItems(){
        return this.basket.size();
    }

    public void addItem(Item item){
      this.basket.add(item);
    }

    public Item removeItem(){
      return this.basket.remove(0);
    }

    public void empty(){
      this.basket.clear();
    }


}