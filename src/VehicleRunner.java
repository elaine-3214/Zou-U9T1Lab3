public class VehicleRunner {
  public static void main(String[] args) {
    Vehicle v = new Vehicle("TX1412", 13.75, 4);
    Car c = new Car("TX1412", 13.75, 4, true);
    Truck t = new Truck("TX1412", 13.75, 4, 2, true);
    Taxi myTaxi4 = new Taxi("TX1412", 13.75, 4, true, 2.0);
    v.openRoof();
    c.openRoof();
    t.openRoof();
    myTaxi4.openRoof();




  }
}