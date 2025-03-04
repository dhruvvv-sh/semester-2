class SC{
    Items[] items;
    int count;
    SC(int maxnumitems){
        items = new Items[maxnumitems];
        count  = 0;
    }
    public class Items{
        String itemName;
        int quantity;
        int price;
        Items(String name,int quant,int price){
            this.itemName = name;
            this.quantity = quant;
            this.price = price;
        }
        void displayItems(){
            System.out.println("Item name:"+itemName);
            System.out.println("quantity:"+quantity);
            System.out.println("price:"+price);
        }
    }
    public void addItems(String itemName,int quant,int price){
        if(count < items.length){
            items[count] = new Items(itemName,quant,price);
            count ++;
        }
        else{
            System.out.println("cannot add more items");
        }
    }
    public void display(){
        for(int i = 0;i<count;i++){
            items[i].displayItems();
        }
    }
}
public class producs{
    public static void main(String[] args) {
        SC item1 = new SC(4);
        item1.addItems("hippochips", 4, 34);
        item1.display();
    }
}
