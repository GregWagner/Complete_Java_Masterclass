public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.name = "Greg";
        player.health = 20;
        player.weapon = "sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health -= 11;
        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player1 = new EnhancedPlayer("Greg", 20, "sword");

        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    }
}
