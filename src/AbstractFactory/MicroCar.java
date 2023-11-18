package AbstractFactory;

public class MicroCar implements Car {
    private final Location location;

    MicroCar(Location location) {
        this.location = location;
    }

    @Override
    public void constructCar() {
        System.out.println("MicroCar : " + location);
    }
}
