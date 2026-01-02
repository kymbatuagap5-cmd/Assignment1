package fitness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FitnessApp app = new FitnessApp();

        System.out.print("How many users do you want to add? ");
        int userCount = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        for (int i = 0; i < userCount; i++) {

            System.out.println("\nEnter user " + (i + 1) + " info:");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Weight: ");
            double weight = scanner.nextDouble();
            scanner.nextLine(); // clear buffer

            User user = new User(name, age, weight);

            // workouts for this user
            System.out.print("How many workouts for this user? ");
            int workoutCount = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < workoutCount; j++) {
                System.out.print("Workout name: ");
                String wName = scanner.nextLine();

                System.out.print("Duration (minutes): ");
                int duration = scanner.nextInt();
                scanner.nextLine();

                user.addWorkout(new WorkoutPlan(wName, duration));
            }

            app.addUser(user);
        }

        // OUTPUT
        System.out.println("\n--- ALL USERS WITH WORKOUTS ---");
        for (User u : app.getUsers()) {
            System.out.println(u);
        }

        scanner.close();
    }
}


