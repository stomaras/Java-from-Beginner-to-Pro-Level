package OOP2.Encapsulation2;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // Create a class and demonstrate proper encapsulation techniques
    // the class will be call printer
    // it will simulate a real Computer printer
    // it should have fields for the toner level, number of pages printed, and
    // also whether its a duplex printer (capable of printing on both sides of the paper)
    // Add methods to fill up the toner ( up to maximum of 100%) , another method to
    // simulate printing a page (which should increase the number of pages printed).
    // Decide on the scope, whether to use constructors, and anything else you think is needed.
    Printer printer = new Printer(50,true);
    System.out.println(" initial pages count = " +printer.getPagesPrinted());
    int pagesPrinted = printer.printPages(4);
    System.out.println("Pages printed was" + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }
}
