import java.util.ArrayList;

public class ShoppingBasket {


    private ArrayList<Purchasable> basket;

    public ShoppingBasket(){
        this.basket = new ArrayList<>();
    }

    public ArrayList<Purchasable> getItems(){
        return this.basket;
    }

    public int numberOfItems(){
        return this.basket.size();
    }

    public void addItem(Purchasable item){
      this.basket.add(item);
    }

    public Purchasable removeItem(){
      return this.basket.remove(0);
    }

    public void empty(){
      this.basket.clear();
    }


}