import java.util.Scanner;

public class FoodTruckApp {

    private static final int MAX_FOOD_TRUCKS = 5;
    private FoodTruck[] fleet = new FoodTruck[MAX_FOOD_TRUCKS];
    private Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        FoodTruckApp fta = new FoodTruckApp();
        fta.run();

    }// *main_Bracket

    public void run() {
        createTrucks();
        displayMenu();
    }

    public void createTrucks() {
        for (int i = 0; i < MAX_FOOD_TRUCKS; i++) {
            System.out.println("Enter a Food Truck name, or type 'Quit': ");
            String truckName = userInput.nextLine();

            if (truckName.equalsIgnoreCase("Quit")) {
                break;
            }

            System.out.println("Enter food type of the Food Truck: ");
            String foodType = userInput.nextLine();

            System.out.println("Enter rating of Food Truck: ");
            int starRating = Integer.parseInt(userInput.nextLine());

            fleet[i] = new FoodTruck(truckName, foodType, starRating);
        }
    }// *createTrucks_Bracket

    private void displayMenu() {
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("============ Pick a number 1-4 =============");
            System.out.println("==== 1. View all existing Food Trucks ======");
            System.out.println("==== 2. View average Food Truck rating =====");
            System.out.println("==== 3. View highest rated Food Trucks =====");
            System.out.println("==== 4. Quit the Food Truck app ============");
            System.out.println("============================================");

            String menuOpt = userInput.nextLine();

            switch (menuOpt) {
                case "1":
                    displayTrucks();
                    break;
                case "2":
                    displayAverageRating();
                    break;
                case "3":
                    displayHighestRating();
                    break;
                case "4":
                    System.out.println("Goodbye! ");
                    userInput.close();
                    return;
                default:
                    System.out.println("Invalid input. Please enter a number between 1 and 4.");
                    break;
            }
        }
    }// *displayMenu_Bracket

    private void displayTrucks() {
        for (FoodTruck truck : fleet) {
            if (truck != null) {
                System.out.println(truck);
            }
        }
    }// *displayTrucks_Bracket

    private void displayAverageRating() {
        int totalRatings = 0;
        int count = 0;

        for (FoodTruck truck : fleet) {
            if (truck != null) {
                totalRatings += truck.getStarRating();
                count++;
            }
        }

        if (count > 0) {
            double averageRating = (double) totalRatings / count;
            System.out.println("Average Ratings: " + averageRating);
        } else {
            System.out.println("No food trucks available.");
        }
    }// *displayAverageRating_Bracket

    private void displayHighestRating() {
        int highestRating = 0;
        FoodTruck highestRatedTruck = null;

        for (FoodTruck truck : fleet) {
            if (truck != null) {
                int current = truck.getStarRating();
                if (current > highestRating) {
                    highestRating = current;
                    highestRatedTruck = truck;
                }
            }
        }

        if (highestRatedTruck != null) {
            System.out
                    .println("Highest Rated: " + highestRatedTruck.getTruckName() + " - " + highestRating + " Stars!");
        } else {
            System.out.println("No food trucks available.");
        }
    }// *displayHighestRating_Bracket

}// *class_Bracket
