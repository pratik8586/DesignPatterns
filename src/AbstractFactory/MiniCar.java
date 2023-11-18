package AbstractFactory;

public class MiniCar extends Car {

    MiniCar(Location location) {
        super(CarType.MINI, location);
        constructCar();
    }

    @Override
    public void constructCar() {
        System.out.println("Connecting to MiniCar ... ");
    }
}
