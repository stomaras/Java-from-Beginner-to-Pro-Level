public class TernaryOperator {
    public static void main(String[] args){
        int newValue = 0;
        if(newValue == 50){
            System.out.println("This is true");
        }
        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is True");
        }

    }
}
