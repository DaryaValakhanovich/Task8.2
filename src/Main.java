public class Main {
    public static void main(String[] args) {
        PassengerCar passengerCar1 = new PassengerCar("BMV", "523i", "black", 2001, 2500);
        PassengerCar passengerCar2 = new PassengerCar("MB", "ML440", "white", 2000, 3000);
        PassengerCar passengerCar3 = new PassengerCar("BMV", "523i", "black", 2500, 2500);
        PassengerCar passengerCar4 = new PassengerCar("MB", "ML440", "blue", 2000, 3000);

        FreightCar freightCar1 = new FreightCar("Renault", "T480", "yellow", 2011, 12000);
        FreightCar freightCar2 = new FreightCar("Scania", "R440", "white", 2011, 12000);

        Bus bus1 = new Bus("Volvo", "F5",  "blue", 1998, 1200);
        Bus bus2 = new Bus("Volvo", "F5",  "yellow", 1998, 1200);

        Garage garage = new Garage();

        garage.carParking(passengerCar1);
        garage.carParking(passengerCar1);
        garage.carParking(passengerCar2);
        garage.carParking(passengerCar3);
        garage.carParking(passengerCar4);
        garage.carParking(passengerCar4);

        garage.carParking(freightCar1);
        garage.carParking(freightCar2);
        garage.carParking(freightCar1);

        garage.carParking(bus1);
        garage.carParking(bus1);
        garage.carParking(bus2);

        System.out.println(garage.howManySuchCars(new PassengerCar("BMV", "523i", "black", 2001, 2500)));
        System.out.println(garage.howManySuchCars(new PassengerCar("MB", "ML440", "white", 2000, 3000)));
        System.out.println(garage.howManySuchCars(passengerCar3));
        System.out.println(garage.howManySuchCars(passengerCar4));

        System.out.println(garage.howManySuchCars(freightCar1));

        System.out.println(garage.howManySuchCars(bus2));
        garage.carDeparture(bus2);
        System.out.println(garage.howManySuchCars(bus2));
        garage.carDeparture(bus2);
    }
}
