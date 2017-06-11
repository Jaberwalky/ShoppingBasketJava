public class Checkout{

  private int total;

  public void Checkout(){
    this.total = total;
  }

  public int total(ShoppingBasket basket){
    int sum = 0;
    for (Purchasable item : basket.getItems()){
      sum += item.getPrice();
    }
    return sum;
  }



}