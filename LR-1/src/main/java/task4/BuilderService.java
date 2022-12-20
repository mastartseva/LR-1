package task4;

class BuilderService {

    public void exec() {
        CarBuilder builder = new CarBuilder();
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarBuilder builder1 = new CarBuilder();
        builder1.setCarType(CarType.CITY_CAR);
        builder1.setSeats(5);
        builder1.setEngine(new Engine(1.8, 2000));
        builder1.setTransmission(Transmission.MANUAL);
        builder1.setTripComputer(new TripComputer());
        builder1.setGPSNavigator(new GPSNavigator());
        Car car1 = builder1.getResult();
        System.out.println("Car built:\n" + car1.toString());

        CarBuilder builder2 = new CarBuilder();
        builder2.setCarType(CarType.SUV);
        builder2.setSeats(7);
        Engine engine2 = new Engine(2.0, 180000);
        engine2.on();
        builder2.setEngine(engine2);
        builder2.setTransmission(Transmission.AUTOMATIC);
        builder2.setTripComputer(new TripComputer());
        builder2.setGPSNavigator(new GPSNavigator());
        Car car2 = builder2.getResult();
        System.out.println("Car built:\n" + car2.toString());
    }
}