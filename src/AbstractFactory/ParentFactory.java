package AbstractFactory;

/**
 * Parent factory class responsible for returning multiple factories
 */
public class ParentFactory {

    public static Car buildCar(CarType type, Location location) {

        switch (location) {
            case INDIA -> {
                return IndiaCarFactory.buildCar(type);
            }
            case USA -> {
                return USACarFactory.buildCar(type);
            }
            case EUROPE -> {
                return EuropeCarFactory.buildCar(type);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Car usaLuxaryCar = ParentFactory.buildCar(CarType.LUXARY, Location.USA);
        usaLuxaryCar.constructCar();

        Car indiaMicroCar = ParentFactory.buildCar(CarType.MICRO, Location.INDIA);
        indiaMicroCar.constructCar();
    }
}
