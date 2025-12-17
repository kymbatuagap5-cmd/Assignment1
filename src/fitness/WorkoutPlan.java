package fitness;

public class WorkoutPlan {
    private String workoutName;
    private int duration; // minutes

    // Constructor
    public WorkoutPlan(String workoutName, int duration) {
        this.workoutName = workoutName;
        this.duration = duration;
    }

    // Getters and Setters
    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // toString method
    @Override
    public String toString() {
        return "WorkoutPlan{workoutName='" + workoutName + "', duration=" + duration + " minutes}";
    }
}
