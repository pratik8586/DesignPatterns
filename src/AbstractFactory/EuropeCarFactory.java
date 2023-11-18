package AbstractFactory;

public class EuropeCarFactory {
    public static Car buildCar(CarType type) {

        switch (type) {
            case MINI -> {
                return new MiniCar(Location.EUROPE);
            }
            case MICRO -> {
                return new MicroCar(Location.EUROPE);
            }
            case LUXARY -> {
                return new LuxaryCar(Location.EUROPE);
            }
        }
        return null;
    }
}
