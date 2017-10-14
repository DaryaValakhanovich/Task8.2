public class FreightCar extends Car{
    public FreightCar(String brand, String model, String color, int yearOfIssue, int volumeOfEngine) {
        super(brand, model, color, yearOfIssue, volumeOfEngine);
    }

    @Override
    public String toString() {
        return "FreightCar{" +
                "brand - " + getBrand() +
                ", model - " + getModel() +
                ", yearOfIssue - " + getYearOfIssue() +
                ", volumeOfEngine - " + getVolumeOfEngine() +
                ", color - " + getColor() +
                '}';
    }
}
