class Shopping{
    private Items[] items;
    private int itemcount;
    public Shopping(int numitem){
        this.items = new Items[numitem];
        this.itemcount = 0;
    }
    class Items{
        private String itemName;
        private int quantity;
        private double price;
        public Items(String itemName,int quantity,double price){
            this.itemName = itemName;
            this.quantity = quantity;
            this.price = price;
        }
    }
    void addItems(String itemName,int quantity,double price){
        if(itemcount<items.length){
            items[itemcount] = new Items(itemName,quantity,price);
            itemcount ++;
        }
        else{
            System.out.println("cannot add more");
        }
    }
}
public class shoppingcart {
    public static void main(String[] args){
        Shopping s1  = new Shopping(3);
        s1.addItems("Apple", 3, 1.5);  // Add items to the cart
        s1.addItems("Banana", 2, 0.75);
        s1.addItems("Orange", 4, 1.25);
    }
    
}
