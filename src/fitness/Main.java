package fitness;

public class Main {
    public static void main(String[] args) {

        // Create Users
        User user1 = new User("Aruzhan", 20, 55.5f);
        User user2 = new User("Dias", 22, 70.0f);

        // Create Workout Plans
        WorkoutPlan plan1 = new WorkoutPlan("Cardio", 30);
        WorkoutPlan plan2 = new WorkoutPlan("Strength", 45);

        // Create Fitness App objects
        FitnessApp app1 = new FitnessApp("MyFitnessApp", user1, plan1);
        FitnessApp app2 = new FitnessApp("MyFitnessApp", user2, plan2);

        // Output to console
        app1.showInfo();
        System.out.println("-----------------");
        app2.showInfo();

        // Compare objects
        System.out.println("Are users the same? " + user1.equals(user2));
    }
}
