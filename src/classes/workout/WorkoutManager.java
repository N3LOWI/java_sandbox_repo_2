package classes.workout;

import java.util.HashSet;

public class WorkoutManager {
    private HashSet<Workout> setOfWorkouts;

    public WorkoutManager() {
        setOfWorkouts = new HashSet<>();
    }

    public void addWorkout(Workout workout) {
        setOfWorkouts.add(workout);
    }

    public void removeWorkout(Workout workout) {
        setOfWorkouts.remove(workout);
    }

    public HashSet<Workout> getWorkouts() {
        return setOfWorkouts;
    }

}
