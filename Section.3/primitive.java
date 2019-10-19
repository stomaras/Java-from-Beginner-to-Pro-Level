public class primitive {

    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " +myMaxIntValue);
        //Overflow
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        //Underflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1) );
    }
}
