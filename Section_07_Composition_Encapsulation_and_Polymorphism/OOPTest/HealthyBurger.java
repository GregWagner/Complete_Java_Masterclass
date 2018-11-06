public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meatType, double price) {
        super("Healthy", meatType, price, "Brown rye");
    }

    public void addHealthyExtra1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyExtra2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if (healthyExtra1Name != null) {
            hamburgerPrice += healthyExtra1Price;
            System.out.println("added " + healthyExtra1Name + " for an extra "
                    + healthyExtra1Price);
        }

        if (healthyExtra2Name != null) {
            hamburgerPrice += healthyExtra2Price;
            System.out.println("added " + healthyExtra2Name + " for an extra "
                    + healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
