package OOP2.Polymorphism2;


class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(boolean engine, int cylinders, String name, int wheels) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(boolean engine, int cylinders, String name, int wheels) {
        super(engine, cylinders, name, wheels);
    }

    @Override
    public String startEngine() {
        return "Mithsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mithsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mithsubishi -> brake()";
    }
}
public class Main {

    public static void main(String[] args) {
	// We are going to go back to the car analogy
    // Create a base class called Car
    // It should have a fiew fields that would be appropriate for a generic car class.
    // engine, cylinders,wheels etc
    // Constructor should initialize cylinders (number of) and name, and set wheels to 4
    // and engine to true. Cylinders and names would be passed parameters
    //
    // Create appropriate getters
    //
    //Show a message for each in the base class
    //Now create a 3 sub classes for your favorite vehicles.
    // Override the appropriate methods to demonstrate polymorphism in use.
    // put all classes in the one java file(this one).

    Car car = new Car(true,8,"Base car",4);
    System.out.println(car.startEngine());
    System.out.println(car.accelerate());
    System.out.println(car.brake());

    Mitsubishi mitsubishi = new Mitsubishi(false,6,"Outlander VRW 4WD",4);
    System.out.println(mitsubishi.startEngine());
    System.out.println(mitsubishi.accelerate());
    System.out.println(mitsubishi.brake());

    Ford ford = new Ford(false,6," Ford Falcon",4);
    System.out.println(ford.startEngine());
    System.out.println(ford.accelerate());
    System.out.println(ford.brake());
    }
}
