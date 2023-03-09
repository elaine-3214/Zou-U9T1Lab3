import java.sql.SQLOutput;

public class Truck extends Vehicle {
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Number of Axles: " + axles + "\n" +
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

  @Override
  public double calculateTollPrice() {
    if (hasTrailer) {
      return 2 * getTollFee() * axles;
    }
    return getTollFee() * axles;
  }
}