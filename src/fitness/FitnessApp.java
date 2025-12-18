package fitness;

public class FitnessApp {
    private String appName;
    private User user;
    private WorkoutPlan workoutPlan;

    public FitnessApp(String appName, User user, WorkoutPlan workoutPlan) {
        this.appName = appName;
        this.user = user;
        this.workoutPlan = workoutPlan;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public WorkoutPlan getWorkoutPlan() {
        return workoutPlan;
    }

    public void setWorkoutPlan(WorkoutPlan workoutPlan) {
        this.workoutPlan = workoutPlan;
    }

    public void showInfo() {
        System.out.println("App: " + appName);
        System.out.println(user);
        System.out.println(workoutPlan);
    }
}
