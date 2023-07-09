import java.util.Scanner;

public class FoodTruckApp {

    private static final int MAX_FOOD_TRUCKS = 5;
    private FoodTruck[] fleet = new FoodTruck[MAX_FOOD_TRUCKS];
    private Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        FoodTruckApp fta = new FoodTruckApp();
        fta.run();

    }// * main

    public void run() {
        createTrucks();
        displayMenu();
    }// * run

    public void createTrucks() {
        boolean isFirstTruck = true;

        for (int i = 0; i < MAX_FOOD_TRUCKS; i++) {
            if (isFirstTruck) {
                System.out.println("Enter a Food Truck name: ");
            } else {
                System.out.println("Enter another Food Truck or Press '4' to Quit: ");
            }

            String truckName = userInput.nextLine();

            if (truckName.equals("4")) {
                break;
            } else {
                System.out.println("Enter food type: ");
                String foodType = userInput.nextLine();

                int starRating = 0;
                boolean validRating = false;

                while (!validRating) {
                    try {
                        System.out.println("Enter Food Truck rating (1-5): ");
                        starRating = Integer.parseInt(userInput.nextLine());
                        if (starRating >= 1 && starRating <= 5) {
                            validRating = true;
                        } else {
                            System.out.println("Invalid rating. Please enter a number between 1 and 5.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid rating. Please enter a valid integer.");
                    }
                }

                fleet[i] = new FoodTruck(truckName, foodType, starRating);

                isFirstTruck = false;
            }
        }
    }

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
    }// * displayMenu

    private void displayTrucks() {
        for (FoodTruck truck : fleet) {
            if (truck != null) {
                System.out.println(truck);
            }
        }
    }// * displayTrucks

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
            System.out.println("Average rating between " + count + " Food Trucks is " + averageRating);
        } else {
            System.out.println("No food trucks available.");
        }
    }// * displayAverageRating

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
                    .println("Highest rated Food Truck is " + highestRatedTruck.getTruckName() + ". "
                            + highestRating + " Stars!");
        } else {
            System.out.println("No food trucks available.");
        }
    }// * displayHighestRating

}// * class
