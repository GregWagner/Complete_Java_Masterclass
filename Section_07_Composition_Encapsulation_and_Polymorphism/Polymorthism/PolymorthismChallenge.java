class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        engine = true;
        wheels = 4;
    }

    public String startEngine() {
        return "Car -> Starting engine";
    }

    public String accelerate() {
        return "Car -> Accelerating";
    }

    public String brake() {
        return "Car -> Braking";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Pinto extends Car {
    public Pinto() {
        super("Pinto", 4);
    }

    @Override
    public String startEngine() {
        return "Pinto -> Starting engine";
    }

    @Override
    public String accelerate() {
        return "Pinto -> Accelerating";
    }

    @Override
    public String brake() {
        return "Pinto -> Braking";
    }
}

class Explorer extends Car {
    public Explorer() {
        super("Explorer", 6);
    }

    @Override
    public String startEngine() {
        return "Explorer -> Starting engine";
    }

    @Override
    public String accelerate() {
        return "Explorer -> Accelerating";
    }

    @Override
    public String brake() {
        return "Explorer -> Braking";
    }
}

public class PolymorthismChallenge {
    public static void main(String[] args) {
        Car car = new Car("Base Car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car pinto = new Pinto();
        System.out.println(pinto.startEngine());
        System.out.println(pinto.accelerate());
        System.out.println(pinto.brake());
    }
}
