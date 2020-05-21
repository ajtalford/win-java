//LibraryItem base class, two immediate derived classes are Book and Periodical.


public class Periodical extends LibraryItem {

    private String topic;
    private boolean series;

    public Periodical(String ISBN, String genre, String author,
                      String binding, double rentCost, double retailPrice,
                      int publishedYear, String topic, boolean series) {
        super(ISBN, genre, author, binding, rentCost, retailPrice, publishedYear);
        this.topic = topic;
        this.series = series;
    }


    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public boolean isSeries() {
        return series;
    }

    public void setSeries(boolean series) {
        this.series = series;
    }
}

//public class Car extends Vehicle {
//    // Simple Car constructor inheriting all of the methods and properties of
//    // Vehicle
//    public Car(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
//               String color, VehicleClassification vehicleClass) {
//        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
//    }
//
//    @Override
//    public double getTargetMargin() {
//        return super.getTargetMargin() - 1000;
//        // Use the getTargetMargin method as its defined in our superclass (Vehicle)
//    }
//}
//    Vehicle
//       |      |      |
//       |      |      |
//      Car   Truck   SUV
//       |
//       |
//   HybridCar