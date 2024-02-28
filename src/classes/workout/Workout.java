package classes.workout;

import java.util.ArrayList;
import java.util.List;

public class Workout {
    private List<Exercise> exercises;
    private String date;
    private String dayOfWeek;
    private WorkoutType workoutType;
    private int duration;

    // Constructor
    public Workout(String date, String dayOfWeek, WorkoutType workoutType, int duration) {
        this.date = date;
        this.dayOfWeek = dayOfWeek;
        this.workoutType = workoutType;
        this.duration = duration;
        this.exercises = new ArrayList<>();
    }

    // Add Exercise to the workout
    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }

    // Getters for other properties

    public List<Exercise> getExercises() {
        return exercises;
    }

    public String getDate() {
        return date;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public WorkoutType getWorkoutType() {
        return workoutType;
    }

    public int getDuration() {
        return duration;
    }
}

// Enum for WorkoutType
enum WorkoutType {
    ARMDAY,
    PUSHDAY,
    PULLDAY,
    LEGDAY,
    OTHER
    // Add more types as needed
}

