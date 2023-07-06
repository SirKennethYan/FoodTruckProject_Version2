public class FoodTruck {

    private static int nextTruckId = 1;
    private int id;
    private String truckName;
    private String foodType;
    private int starRating;

    public FoodTruck() {

    }

    public FoodTruck(String truckName, String foodType, int starRating) {
        this.id = nextTruckId++;
        this.truckName = truckName;
        this.foodType = foodType;
        this.starRating = starRating;
    }

    public int getId() {
        return id;
    }

    public String getTruckName() {
        return truckName;
    }

    public String getFoodType() {
        return foodType;
    }

    public int getStarRating() {
        return starRating;
    }

    @Override
    public String toString() {
        return "Truck Name: " + truckName + "\nId: " + id + "\nFood Type: " + foodType + "\n";
    }
}
