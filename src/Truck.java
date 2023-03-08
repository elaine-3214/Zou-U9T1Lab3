public class Truck extends Vehicle {
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public void printTruck() {
    System.out.println("License Plate: " + getLicensePlate() + "\n" +
            "Toll Fee: " + getTollFee() + "\n" +
            "Passengers: " + getPassengers() + "\n" +
            "Number of Axles: " + axles + "\n" +
            "Has Trailer: " + hasTrailer);
  }


  public boolean validateLicensePlate() {
    String plateEnd = getLicensePlate().substring(getLicensePlate().length()-2);
    if (hasTrailer && axles > 4) {
      if (!plateEnd.equals("MX")) {
        return false;
      }
    } else if (hasTrailer && axles <= 4) {
      if (!plateEnd.equals("LX")) {
        return false;
      }
    } else {
      return true;
    }
    return true;
  }
}