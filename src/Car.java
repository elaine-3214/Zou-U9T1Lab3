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

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Electric: " + electric + "\n" +
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
  @Override
  public double calculateTollPrice() {
    if (getPassengers() > 4) {
      return getTollFee() * 4;
    }
    return getTollFee() * getPassengers();
  }
}