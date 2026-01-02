package fitness;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FitnessApp {

    private ArrayList<User> users;
    private ArrayList<WorkoutPlan> workoutPlans;

    public FitnessApp() {
        users = new ArrayList<>();
        workoutPlans = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addWorkoutPlan(WorkoutPlan workoutPlan) {
        workoutPlans.add(workoutPlan);
    }

    public User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

    public ArrayList<User> filterUsersByAge(int minAge) {
        ArrayList<User> result = new ArrayList<>();
        for (User user : users) {
            if (user.getAge() > minAge) {
                result.add(user);
            }
        }
        return result;
    }

    public void sortUsersByAge() {
        Collections.sort(users, Comparator.comparingInt(User::getAge));
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<WorkoutPlan> getWorkoutPlans() {
        return workoutPlans;
    }
}
