public class Bus extends Car{
    public Bus(String brand, String model, String color, int yearOfIssue, int volumeOfEngine) {
        super(brand, model, color, yearOfIssue, volumeOfEngine);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand - " + getBrand() +
                ", model - " + getModel() +
                ", yearOfIssue - " + getYearOfIssue() +
                ", volumeOfEngine - " + getVolumeOfEngine() +
                ", color - " + getColor() +
                '}';
    }
}
