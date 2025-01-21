class workingwithtwoclasses {
    double length;
    double width;
    void getdata(float a,float b){
        length = a;
        width = b;
    }
}
class roomarea {
    public static void main(String[] args){
        workingwithtwoclasses room1 = new workingwithtwoclasses();
        room1.getdata(10,14);
        double area  = room1.length * room1.width;
        System.out.print("the area is:"+area);
    }
}
