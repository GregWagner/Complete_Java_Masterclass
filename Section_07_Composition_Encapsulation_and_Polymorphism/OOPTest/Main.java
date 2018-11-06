public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Beef", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addAddition1("Tomato", 0.27);
        hamburger.addAddition2("Lettuce", 0.75);
        hamburger.addAddition3("Cheese", 1.12);
        System.out.printf("Total Burger price is $%.2f%n%n",
                hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthyExtra1("Egg", 5.43);
        System.out.printf("Total Burger price is $%.2f%n",
                healthyBurger.itemizeHamburger());
        healthyBurger.addHealthyExtra2("Lentils", 3.41);
        System.out.printf("Total Burger price is $%.2f%n%n",
                healthyBurger.itemizeHamburger());

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        deluxeHamburger.itemizeHamburger();
        deluxeHamburger.addAddition1("Stuff", 100.0);
        System.out.printf("Total Burger price is $%.2f%n%n",
                deluxeHamburger.itemizeHamburger());
    }
}
