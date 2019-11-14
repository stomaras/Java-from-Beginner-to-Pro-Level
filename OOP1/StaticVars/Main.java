package OOP1.StaticVars;

public class Main {

    public static void main(String[] args) {
	    Dog rex = new Dog("rex"); //create instance (rex)
	    Dog flufly = new Dog("flufly"); //create instance (flufly)
        rex.printName(); // prints flufly
        flufly.printName(); // prints flufly
    }
}
