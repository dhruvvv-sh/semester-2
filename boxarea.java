class boxdim{
    int length;
    int width;
    int height;
    boxdim(int l,int w,int z){
        length = l;
        width = w;
        height = z;
        System.out.println("the figure given is :cuboid of dim "+length+","+width+","+height);
    }
    boxdim(int s){
        length=height=width= s;
        System.out.println("the figure given is :square of side "+s);
    }
    int vol(){
        int volume = length*width*height;
        return volume;
    }


}
public class boxarea {
    public static void main(String[] args){
        boxdim b1 = new boxdim(2);
        boxdim b2 = new boxdim(2,3,4);
        System.out.println("the volume is:"+b1.vol()+","+b2.vol());
    }
    
}
