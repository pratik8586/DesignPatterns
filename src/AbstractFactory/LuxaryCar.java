package AbstractFactory;

public class LuxaryCar implements Car {
    private final Location location;

    LuxaryCar(Location location) {
        this.location = location;
    }

    @Override
    public void constructCar() {
        System.out.println("LuxaryCar :" + location);
    }
}
