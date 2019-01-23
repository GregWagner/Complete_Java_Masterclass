public class Car extends Vehicle {
    private int wheels;
    private int door;
    private boolean isManual;
    private int gears;

    private int currentGear;

    public Car(String name, String size, int wheels, int door,
            boolean isManual, int gears) {
        super(name, size);
        this.wheels = wheels;
        this.door = door;
        this.isManual = isManual;
        this.gears = gears;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Changed to " + currentGear);
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity(): Changed to " + speed);
        super.move(speed, direction);
    }
}
