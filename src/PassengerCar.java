public class PassengerCar extends Car{
    public PassengerCar(String brand, String model, String color, int yearOfIssue, int volumeOfEngine) {
        super(brand, model, color, yearOfIssue, volumeOfEngine);
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "brand - " + getBrand() +
                ", model - " + getModel() +
                ", yearOfIssue - " + getYearOfIssue() +
                ", volumeOfEngine - " + getVolumeOfEngine() +
                ", color - " + getColor() +
                '}';
    }
}
