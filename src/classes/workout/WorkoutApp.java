package classes.workout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkoutApp {

    private DefaultListModel<Workout> workoutListModel = new DefaultListModel<>();
    private JList<Workout> workoutList = new JList<>(workoutListModel);

    public void createAndShowGUI() {
        JFrame frame = new JFrame("Workout Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);

        JButton addButton = new JButton("Add Workout");
        JButton editButton = new JButton("Edit Workout");
        JButton deleteButton = new JButton("Delete Workout");
        JButton viewButton = new JButton("View Workout");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addWorkout();
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editWorkout();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteWorkout();
            }
        });

        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewWorkout();
            }
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(workoutList), BorderLayout.CENTER);
        panel.add(addButton, BorderLayout.NORTH);
        panel.add(editButton, BorderLayout.WEST);
        panel.add(deleteButton, BorderLayout.EAST);
        panel.add(viewButton, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void addWorkout() {
        // Implement logic for adding a workout
        // You may open a new window or dialog for user input
        // Update the workoutListModel and refresh the JList
    }

    private void editWorkout() {
        Workout selectedWorkout = workoutList.getSelectedValue();
        if (selectedWorkout != null) {
            // Implement logic for editing a workout
            // You may open a new window or dialog for user input
            // Update the workoutListModel and refresh the JList
        } else {
            showAlert("No Workout Selected", "Please select a workout to edit.");
        }
    }

    private void deleteWorkout() {
        Workout selectedWorkout = workoutList.getSelectedValue();
        if (selectedWorkout != null) {
            workoutListModel.removeElement(selectedWorkout);
        } else {
            showAlert("No Workout Selected", "Please select a workout to delete.");
        }
    }

    private void viewWorkout() {
        Workout selectedWorkout = workoutList.getSelectedValue();
        if (selectedWorkout != null) {
            // Implement logic for viewing a workout
            // You may open a new window or dialog to display workout details
        } else {
            showAlert("No Workout Selected", "Please select a workout to view.");
        }
    }

    private void showAlert(String title, String content) {
        JOptionPane.showMessageDialog(null, content, title, JOptionPane.INFORMATION_MESSAGE);
    }
}


