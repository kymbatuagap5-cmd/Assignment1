package fitness;

import java.util.ArrayList;
import java.util.Objects;

public class User extends Person {

    private double weight;
    private ArrayList<WorkoutPlan> workouts;

    public User(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
        this.workouts = new ArrayList<>();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void addWorkout(WorkoutPlan workout) {
        workouts.add(workout);
    }

    public ArrayList<WorkoutPlan> getWorkouts() {
        return workouts;
    }

    @Override
    public String getInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + weight +
                ", workouts=" + workouts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getAge() == user.getAge() &&
                Double.compare(user.weight, weight) == 0 &&
                Objects.equals(getName(), user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), weight);
    }
}


