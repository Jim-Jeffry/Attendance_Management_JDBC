package revision1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class AttendanceGUI extends Application {

    // Backend logic
    static ArrayList<String> students = new ArrayList<>();
    static ArrayList<String> studentsIn = new ArrayList<>();
    static ArrayList<String> studentsOut = new ArrayList<>();
    static LinkedHashMap<String, String> st_in = new LinkedHashMap<>();
    static LinkedHashMap<String, String> st_out = new LinkedHashMap<>();
    
    static {
        students.add("Jim");
        students.add("Bala");
        students.add("Sanjay");
        students.add("Bharath");
    }

    // UI Components
    TextField nameField = new TextField();
    TextArea outputArea = new TextArea();
    Button markInButton = new Button("Mark In");
    Button markOutButton = new Button("Mark Out");
    Button checkPresentButton = new Button("Check Present");
    Button checkAbsentButton = new Button("Check Absent");
    Button addStudentButton = new Button("Add Student");
    Button removeStudentButton = new Button("Remove Student");
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Creating layout
        VBox layout = new VBox(10);
        layout.setPadding(new javafx.geometry.Insets(10));

        // Setting up the text field and buttons
        nameField.setPromptText("Enter Student Name");
        
        markInButton.setOnAction(e -> studentIn());
        markOutButton.setOnAction(e -> studentOut());
        checkPresentButton.setOnAction(e -> checkPresent());
        checkAbsentButton.setOnAction(e -> checkAbsent());
        addStudentButton.setOnAction(e -> addStudent());
        removeStudentButton.setOnAction(e -> removeStudent());

        // Text Area for output
        outputArea.setEditable(false);
        
        // Adding components to layout
        layout.getChildren().addAll(
                new Label("Attendance System"),
                nameField,
                markInButton,
                markOutButton,
                checkPresentButton,
                checkAbsentButton,
                addStudentButton,
                removeStudentButton,
                new Label("Output:"),
                outputArea
        );

        // Setting up the scene and stage
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setTitle("Attendance Management System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Backend interaction methods
    private void studentIn() {
        String name = nameField.getText().trim();
        if (students.contains(name)) {
            if (!studentsIn.contains(name)) {
                studentsIn.add(name);
                LocalTime now = LocalTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                String formattedTime = now.format(formatter);
                st_in.put(name, formattedTime);
                outputArea.appendText("Attendance marked IN for " + name + " at " + formattedTime + "\n");
            } else {
                outputArea.appendText("Attendance already marked IN for " + name + "\n");
            }
        } else {
            outputArea.appendText("Invalid Student Name\n");
        }
    }

    private void studentOut() {
        String name = nameField.getText().trim();
        if (studentsIn.contains(name)) {
            if (!studentsOut.contains(name)) {
                studentsOut.add(name);
                LocalTime now = LocalTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                String formattedTime = now.format(formatter);
                st_out.put(name, formattedTime);
                outputArea.appendText("Attendance marked OUT for " + name + " at " + formattedTime + "\n");
            } else {
                outputArea.appendText("Attendance already marked OUT for " + name + "\n");
            }
        } else {
            outputArea.appendText("You must mark attendance IN first\n");
        }
    }

    private void checkPresent() {
        outputArea.appendText("Present Students: " + studentsIn + "\n");
    }

    private void checkAbsent() {
        ArrayList<String> absentStudents = new ArrayList<>(students);
        absentStudents.removeAll(studentsIn);
        outputArea.appendText("Absent Students: " + absentStudents + "\n");
    }

    private void addStudent() {
        String name = nameField.getText().trim();
        if (!students.contains(name)) {
            students.add(name);
            outputArea.appendText("Student added: " + name + "\n");
        } else {
            outputArea.appendText("Student already exists: " + name + "\n");
        }
    }

    private void removeStudent() {
        String name = nameField.getText().trim();
        if (students.remove(name)) {
            outputArea.appendText("Student removed: " + name + "\n");
        } else {
            outputArea.appendText("Student not found: " + name + "\n");
        }
    }
}

