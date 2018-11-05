public class Pinto extends Car {
    private int roadServiceMonths;

    public Pinto(int roadServiceMonths) {
        super("Pinto", "Compact", 4, 2, false, 4);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity < 10) {
            changeGear(2);
        } else if (newVelocity > 10 && newVelocity < 20) {
            changeGear(3);
        } else if (newVelocity > 20) {
            changeGear(4);
        } else {
            changeGear(0);
        }

        if (newVelocity != 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
