package AbstractFactory;

public abstract class Car {

    CarType model;
    Location location;

    Car(CarType model, Location location) {
        this.model = model;
        this.location = location;
    }

    abstract void constructCar();


    public CarType getModel() {
        return model;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "CarModel - " + model + " located in " + location;
    }
}
