class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }
    void makesound(){
        System.out.println("animal makes sound");
    }
}
class Dog extends Animal {

    Dog(String name) {
        // Calling the constructor of the superclass (Animal)
        super(name);
    }

    @Override
    void makeSound() {
        // Calling the superclass method
        super.makeSound();
        System.out.println("Dog barks");
    }
}
public class super{
    public static void main(String[] args){
        Dog dog = new Dog("Rex");
        dog.makeSound();
    }
}

