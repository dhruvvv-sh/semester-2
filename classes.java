public class classes {

    static double add(double x, double y) {
        return x + y;
    }

    static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(add(1.0, 2)); // Calls the add(double, double) method

        // Create a Car object and set its properties
        Car car1 = new Car();
        car1.carNumber = 240953;
        car1.carCol = "blue";
        car1.carSpeed = 120;

        // Print car details using the overridden toString method
        System.out.println(car1.carNumber);
    }
}

class Car {
    int carNumber;
    String carCol;
    int carSpeed;
}
