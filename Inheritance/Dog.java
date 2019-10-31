package Inheritance;
public class Dog extends Animal {
    private int eyes;//not all animals have eyes
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        //Now we will initialize an extra behaviour that is methods that are unique for a dog
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    // I will create a special method for the dog for eating, which is chew a single attribute
    // I can put in override method give us a list of methods including the constructor that are available on animal class
    //In other words it says ok i know that you are extending from the animal class these are the methods that can be overridden
    //In other words we can create a version of that same method that exists in the Animal class but make it unique for the dog
    // class , and that's something that is inherently very powerful The other thing i want to point out here is, you notice this
    //java.lang.Object i'm going to talk about that in the next video, but what that is, that every single class you create
    //even though it does not come up and show you by the use of the extends keyword , it does actually get extended this Object class
    //which is a special class created by java

    @Override
    public void eat() {
        // We are overriding a method that is in the superclass in this case in the animal class
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
}
