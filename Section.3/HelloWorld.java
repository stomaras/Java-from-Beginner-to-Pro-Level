//public: is an access modifier 
//static: is a java keyword that needs an understanding of other concepts for now that we need to have a static for java to find our method to run the code we are going to add
//void: is yet another java keyword used o indicate that the method will not return anything - more on that later 
//Code block: is used to define a block of code.it's mandatory to have one in a method declaration and it's have where we will be adding statements to perform certain tasks
//Statement: This is a complete command to be executed and can include one or more expressions
public class HelloWorld {
  
  public static void main(String[] args){
        System.out.println("Hello Tomy");
        //Variables are a way to store infrmation in our computer.Variables that we define in a program can be accessed by a name we give them
        //and the computer does the hard work of figuring out where they get stored in the computer Random Access Memory
        int myFirstNumber = (10 + 5) + (2 * 10);
        //Declaration Statement used to define a variable by indicating the data type , and the name, and optionally to set the variable to a certain value
        //Here the type(short for Data Type)is an int,the name is myFirstNumber and the value we are assigning or initializing our variable with is 5.Wea are
        //declaring a variable of type int with the name myFirstNumber and assigning the value 5 to it
        //String Literal
        System.out.println("MyFirstNumber");
        System.out.println(myFirstNumber);
  }
}
