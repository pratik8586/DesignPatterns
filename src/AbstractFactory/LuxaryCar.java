package AbstractFactory;

public class LuxaryCar extends Car {
    LuxaryCar(Location location) {
        super(CarType.LUXARY, location);
        constructCar();
    }

    @Override
    public void constructCar() {
        System.out.println("Connecting to LuxaryCar ...");
    }
}
