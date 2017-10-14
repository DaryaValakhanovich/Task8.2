import java.util.HashMap;

public class Garage {
    private HashMap<Car, Integer> cars = new HashMap<>();

    public void carParking(Car car){
        if (cars.containsKey(car)) {
                cars.put(car, cars.get(car) + 1);
            } else {
                cars.put(car, 1);
            }
    }

    public void carDeparture(Car car){
        if ((!cars.containsKey(car) || (cars.get(car)) == 0)){
            System.out.println("There isn't such car in the garage.");
        } else {
            cars.put(car, cars.get(car) - 1);
        }
    }

    public int howManySuchCars(Car car){
        return cars.get(car);
    }
}
