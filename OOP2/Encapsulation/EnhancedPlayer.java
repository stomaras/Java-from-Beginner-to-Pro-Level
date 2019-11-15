package OOP2.Encapsulation;


public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;
    // So in other words we are guaranteeing now that the name , the health, and the weapon are initialized
    // when the class is creted.
    public EnhancedPlayer(String name, int health, String weapon){
        this.name = name;
        if(health > 0 && health <= 100){
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0){
            System.out.println("Player knocked out");
            //Reduce number of lives remaining for the player
        }
    }

    public int getHealthh() {
        return hitPoints;
    }
}
