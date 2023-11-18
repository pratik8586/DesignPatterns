package AbstractFactory;

public class MiniCar implements Car {
    private final Location location;

    MiniCar(Location location) {
        this.location = location;
    }

    @Override
    public void constructCar() {
        System.out.println("MiniCar : " + location);
    }
}
