public class Hamburger {
    private String name;
    private String meatType;
    private double price;
    private String rollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meatType, double price, String rollType) {
        this.name = name;
        this.meatType = meatType;
        this.price = price;
        this.rollType = rollType;
    }

    public void addAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = price;
        System.out.printf("%s hamburger on a %s roll with %s, price: $%.2f%n",
                name, rollType, meatType, hamburgerPrice);

        if (addition1Name != null) {
            hamburgerPrice += addition1Price;
            System.out.println("added " + addition1Name + " for an extra "
                    + addition1Price);
        }

        if (addition2Name != null) {
            hamburgerPrice += addition2Price;
            System.out.println("added " + addition2Name + " for an extra "
                    + addition2Price);
        }

        if (addition3Name != null) {
            hamburgerPrice += addition3Price;
            System.out.println("added " + addition3Name + " for an extra "
                    + addition3Price);
        }

        if (addition4Name != null) {
            hamburgerPrice += addition4Price;
            System.out.println("added " + addition4Name + " for an extra "
                    + addition4Price);
        }
        return hamburgerPrice;
    }
}
