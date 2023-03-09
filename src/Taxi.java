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

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fare Collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += farePerRider * numRiders;
        if (!isDiscountApplied() && getPassengers() >= 4) {
                setTollFee(getTollFee() * 0.5);
                setDiscountApplied(true);
        }
    }


    public boolean chargeAndDropOffRiders(double farePerRider) {
        dropOffPassengers(getPassengers());
        fareCollected += farePerRider * (getPassengers() - 1);
        setPassengers(1);
        return true;
    }

    @Override
    public void openRoof() {
        System.out.println("Let's not open the roof because we don't have one");
    }


}
