package AbstractFactory;

public class MicroCar extends Car {

    MicroCar(Location location) {
        super(CarType.MICRO, location);
        constructCar();
    }

    @Override
    public void constructCar() {
        System.out.println("Connecting to MicroCar ...");
    }
}
