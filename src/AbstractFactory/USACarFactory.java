package AbstractFactory;

public class USACarFactory {
    public static Car buildCar(CarType type) {

        switch (type) {
            case MINI -> {
                return new MiniCar(Location.USA);
            }
            case MICRO -> {
                return new MicroCar(Location.USA);
            }
            case LUXARY -> {
                return new LuxaryCar(Location.USA);
            }
        }
        return null;
    }

}
