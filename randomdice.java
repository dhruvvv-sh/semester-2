import java.util.Random;
class Die{
    Random rand = new Random();
    int sidevalue;
    public void GetSideUp(){
        System.out.println("the value is:"+sidevalue);
    }
    public void roll(Die obj){
        sidevalue = obj.rand.nextInt(7)-0;
    }
}
public class randomdice {
    public static void main(String[] args){
        Die d1 = new Die();
        d1.roll(d1);
        d1.GetSideUp();
    }
}
