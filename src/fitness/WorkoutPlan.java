package fitness;

import java.util.Objects;

public class WorkoutPlan {

    private String workoutName;
    private int duration;

    public WorkoutPlan(String workoutName, int duration) {
        this.workoutName = workoutName;
        this.duration = duration;
    }

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

    @Override
    public String toString() {
        return "WorkoutPlan{" +
                "workoutName='" + workoutName + '\'' +
                ", duration=" + duration +
                " minutes}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkoutPlan)) return false;
        WorkoutPlan that = (WorkoutPlan) o;
        return duration == that.duration &&
                Objects.equals(workoutName, that.workoutName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workoutName, duration);
    }
}


