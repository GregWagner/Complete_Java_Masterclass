public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Greg";
        player.health = 20;
        player.weapon = "Sword";

        player.loseHealth(10);
        System.out.printf("Remaining health = %d%n", player.healthRemaining());

        player.loseHealth(11);
        System.out.printf("Remaining health = %d%n", player.healthRemaining());


    }
}
