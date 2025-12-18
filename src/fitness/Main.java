package fitness;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Aruzhan", 20, 55.5f);
        User user2 = new User("Dias", 22, 70.0f);

        WorkoutPlan plan1 = new WorkoutPlan("Cardio", 30);
        WorkoutPlan plan2 = new WorkoutPlan("Strength", 45);

        FitnessApp app1 = new FitnessApp("MyFitnessApp", user1, plan1);
        FitnessApp app2 = new FitnessApp("MyFitnessApp", user2, plan2);

        app1.showInfo();
        System.out.println("-----------------");
        app2.showInfo();

        System.out.println("Are users the same? " + user1.equals(user2));
    }
}
