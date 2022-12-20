package task4;

class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public String showStatus() {
        if (car.getEngine().isStarted()) {
            return "Car is started";
        } else {
            return "Car isn't started";
        }
    }
}