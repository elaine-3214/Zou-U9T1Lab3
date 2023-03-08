public class Taxi extends Car{
    //instance variables
    private double fareCollected;
    //constructor
    public Taxi (String licensePlate,
                 double tollFee,
                 int passengers,
                 boolean electric,
                 double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }
    public void printTaxi() {
        System.out.println("License Plate: " + getLicensePlate() + "\n" +
                "Toll Fee: " + getTollFee() + "\n" +
                "Passengers: " + getPassengers() + "\n" +
                "Electric: " + isElectric() + "\n" +
                "Discount Applied: " + isDiscountApplied() + "\n" +
                "Fare Collected: " + fareCollected);
    }


    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += farePerRider * numRiders;
        if (!isDiscountApplied() && getPassengers() >= 4) {
                setTollFee(getTollFee() * 0.5);
                setDiscountApplied(true);
        }

    }


}
