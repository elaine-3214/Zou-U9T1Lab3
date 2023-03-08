public class Car extends Vehicle {
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public boolean isElectric() {
    return electric;
  }

  public boolean isDiscountApplied() {
    return discountApplied;
  }

  public void setDiscountApplied(boolean temp) { discountApplied = temp; }
  public void printCar() {
    System.out.println("License Plate: " + getLicensePlate() + "\n" +
                       "Toll Fee: " + getTollFee() + "\n" +
                       "Passengers: " + getPassengers() + "\n" +
                       "Electric: " + electric + "\n" +
                       "Discount Applied: " + discountApplied);
  }

  public boolean dropOffPassengers(int numOut) {
    if (numOut < getPassengers()) {
      setPassengers(getPassengers() - numOut);
      return true;
    } else {
      return false;
    }
  }

  public void applyDiscount() {
    if (!discountApplied && electric) {
      setTollFee(getTollFee() * 0.5);
      discountApplied = true;
    }
  }
}