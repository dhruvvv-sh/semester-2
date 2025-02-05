class boxdim{
    int length;
    int width;
    boxdim(int l,int w){
        length = l;
        width = w;
        System.out.println("the dim are:"+width+","+length);
    }
    int area(){
        int area = length * width;
        return area;
    }
}
public class box {
    public static void main(String[] args){
        boxdim ob1 = new boxdim(10,20);
        System.out.println("the area of the box is:"+ ob1.area());
    }
    
}
