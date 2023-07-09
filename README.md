# MakeChangeProject_Version2

# Description

Welcome to 'Food Truck Version 2'! 🚚🌮 This enhanced Java program takes your food truck experience to the next level. Create and manage your fleet of food trucks effortlessly by inputting truck names, food types, and star ratings. Discover a range of features, including viewing all trucks, calculating the average rating, and finding the highest rated truck. We've made improvements like verification checks to ensure a smooth experience.

**FoodTruck App**

1. Method Naming: The `getMenu()` method is renamed to `displayMenu()` in the refactored code to better reflect its purpose.

- Original Code: The method name is `getMenu()`.
- Refactored Code: The method name is changed to `displayMenu()`.

2. Main Method Refactoring: The `run()` method is introduced to separate the logic from the `main()` method. The `run()` method is called from the `main()` method to execute the program.

- Original Code: The logic is directly present in the `main()` method.
- Refactored Code: The logic is moved to a separate `run()` method, which is called from the `main()` method.

3. Improved User Input Handling: In the `createTrucks()` method, the handling of user input for the food truck rating is improved. It now checks if the input is a valid integer between 1 and 5. It continues to prompt the user until a valid rating is entered.

- Original Code: The input is read as an integer directly without any validation.
- Refactored Code: The input is validated to ensure it is a valid integer between 1 and 5.

4. Menu Handling: The menu handling in the `displayMenu()` method is improved using a `while` loop. It keeps running until the user chooses to quit. The `switch` statement is used to handle different menu options.

- Original Code: The menu handling uses a series of `if-else` statements.
- Refactored Code: The menu handling is improved using a `while` loop and a `switch` statement.

5. Display Average Rating: In the `displayAverageRating()` method, a check is added to handle the case when there are no food trucks available. It prints a message indicating that there are no food trucks instead of trying to calculate the average rating.

- Original Code: The average rating is calculated without checking if there are any food trucks available.
- Refactored Code: A check is added to handle the case when there are no food trucks, and a message is printed indicating that there are no food trucks available.

6. Display Highest Rating: Similar to the `displayAverageRating()` method, a check is added in the `displayHighestRating()` method to handle the case when there are no food trucks available. It prints a message indicating that there are no food trucks instead of trying to display the highest rated truck.

- Original Code: The highest rated truck is displayed without checking if there are any food trucks available.
- Refactored Code: A check is added to handle the case when there are no food trucks, and a message is printed indicating that there are no food trucks available.

7. Other Minor Changes: There are a few other minor changes in variable names and formatting for improved readability and consistency.

**FoodTruck**

1. Class Name: The class name is changed from `Foodtruck` to `FoodTruck` to follow standard Java naming conventions for class names.

- Original Code: The class name is `Foodtruck`.
- Refactored Code: The class name is changed to `FoodTruck`.

2. Field Initialization: In the refactored code, the `nextTruckId` is initialized to `1` directly in the field declaration.

- Original Code: The static field is not initialized in the field declaration.
- Refactored Code: The static field is initialized to `1` in the field declaration.

3. Instance Variable Initialization: The `nextTruckId` increment and `id` assignment are combined in the constructor of the refactored code. The `nextTruckId` is incremented and then assigned to the `id` field.

- Original Code: The `nextTruckId` is incremented separately from the `id` assignment.
- Refactored Code: The `nextTruckId` is incremented and assigned to the `id` field in a single line.

4. Getter and Setter Methods: The setter methods for id, truckName, foodType, and starRating are removed since they are not used in the refactored code.

- Original Code: Getter and setter methods are present for id, truckName, foodType, and starRating.
- Refactored Code: The setter methods for id, truckName, foodType, and starRating are removed.

5. `toString()` Method: The `toString()` method is simplified in the refactored code. The `starRating` field is removed from the `toString()` method since it is not used in the output.

- Original Code: The `toString()` method includes the `starRating` field in the output.
- Refactored Code: The `toString()` method no longer includes the `starRating` field in the output.

# Technologies Used

<p align="left"> <a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> </p>
