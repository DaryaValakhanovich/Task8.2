public abstract class Car {
    private String brand;
    private String model;
    private int yearOfIssue;
    private int volumeOfEngine;
    private String color;

    public Car(String brand, String model, String color, int yearOfIssue, int volumeOfEngine){
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
        this.volumeOfEngine = volumeOfEngine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearOfIssue != car.yearOfIssue) return false;
        if (volumeOfEngine != car.volumeOfEngine) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        return color != null ? color.equals(car.color) : car.color == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + yearOfIssue;
        result = 31 * result + volumeOfEngine;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public int getVolumeOfEngine() {
        return volumeOfEngine;
    }
    public String getColor() {
        return color;
    }
}
