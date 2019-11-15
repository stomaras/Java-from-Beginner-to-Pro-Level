package OOP2.Encapsulation;


public class Main {

    public static void main(String[] args) {
	// write your code here
    //Player player = new Player();
    //player.name = "Tom";
    //player.health = 20;
    //player.weapon = "Sword";

    //int damage = 10;
    //player.loseHealth(damage);
    //System.out.println(" Remaining health = " + player.healthRemaining());

    //damage = 11;
    //player.loseHealth(damage);
    //System.out.println(" Remaining health = " + player.healthRemaining());

    EnhancedPlayer player = new EnhancedPlayer("Tom",101,"Sword");
    System.out.println("Initial health is "+ player.getHealthh());
    }
}
