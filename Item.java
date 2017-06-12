public class Item implements Purchasable {

  private String name;
  private int price;
  private boolean promoStatus;

  public Item(String name, int price, boolean promoStatus){
    this.name = name;
    this.price = price;
    this.promoStatus = promoStatus;
  }

  public String getName(){
    return this.name;
  }

  public int getPrice(){
    return this.price;
  }

  public boolean getPromoStatus(){
    return this.promoStatus;
  }

  public void setPromoStatus(boolean status){
    this.promoStatus = status;
  }

  public boolean equals(Item itemToCompare) {
      if (!(itemToCompare instanceof Item)) {
          return false;
      }
      Item toCompare = (Item) itemToCompare;
      return this.name.equals(toCompare.getName())
          && (this.price == toCompare.getPrice())
          && (this.promoStatus == toCompare.getPromoStatus());
  }

}