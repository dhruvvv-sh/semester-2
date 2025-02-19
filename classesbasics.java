class Car{
    String color;
    int car_number;
    Car(String x){
        color = x;
        System.out.println("the color of the car is :"+color);
    }
    void carnumber(int n){
        car_number = n;
        System.out.println("car number:"+car_number);
    }
    void display(){
        System.out.println("car details:");
        System.out.println("the color of the car is :"+color);
        System.out.println("car number:"+car_number);
    }
}
public class classesbasics {
    public static void main(String[] args){
        Car c1 = new Car("blue");
        c1.carnumber(240953504);
        c1.display();
    }
    
}
