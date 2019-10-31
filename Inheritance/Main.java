package Inheritance
public class Main {

    public static void main(String[] args) {
	// write your code here
    Animal animal = new Animal("Animal",1,1,5,5);
    Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"long silky");
    dog.eat();
    // We can use eat() method even though it does not part of the dog class , because inheritance help us
    // Even though we are accessing the Dog class, it knows that the dog is a type of an animal because we have inherited
    //from the class animal .As a result of doing that , we are able to access the functionality that's part and parcel of the animal
    //class, and we are able to use the eat method

    }
}
