public class Vehicle {
  private String licensePlate;
  private double tollFee;
  private int passengers;
  
  public Vehicle(String licensePlate, double tollFee, int passengers) {
    this.licensePlate = licensePlate;
    this.tollFee = tollFee;
    this.passengers = passengers;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public double getTollFee() {
    return tollFee;
  }

  public int getPassengers() {
    return passengers;
  }
  public void setPassengers(int num) {
    passengers = num;
  }

  public void setTollFee(double num) {
    tollFee = num;
  }
  
  public double calculateTollPrice() {
    return tollFee * passengers;
  }

  public void printInfo() {
    System.out.println("License Plate: " + licensePlate + "\n" +
                       "Toll Fee: " + tollFee + "\n" +
                       "Passengers: " +passengers);
  }

  public void openRoof() {
    System.out.println("Let's open the roof cause bird poop is nice");
  }
}