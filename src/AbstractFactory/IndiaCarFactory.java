package AbstractFactory;

public class IndiaCarFactory {

    public static Car buildCar(CarType type) {

        switch (type) {
            case MINI -> {
                return new MiniCar(Location.INDIA);
            }
            case MICRO -> {
                return new MicroCar(Location.INDIA);
            }
            case LUXARY -> {
                return new LuxaryCar(Location.INDIA);
            }
        }
        return null;
    }
}
