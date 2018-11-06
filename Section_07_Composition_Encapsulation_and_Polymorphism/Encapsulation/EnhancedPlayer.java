/*
 * Has encapsulation
 */
public class EnhancedPlayer {
    public String name;
    public int health;
    public String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health >= 0 && health <= 100) {
            this.health = health;
        } else {
            this.health = 100;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("com.company.Player knocked out");
        }
    }

    public int healthRemaining() {
        return health;
    }
}
