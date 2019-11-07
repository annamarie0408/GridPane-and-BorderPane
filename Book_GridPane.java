import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Book_GridPane extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER); // Set center alignment
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(7.7);
        pane.setVgap(5.5); // Set vGap to 5.5px

        // Place nodes in the pane
        pane.add(new Label("Enter Book Title:"), 0, 0);
        pane.add(new TextField(), 1, 0);
        pane.add(new Label("Enter Book Author:"), 0, 1);
        pane.add(new TextField(), 1, 1);
        pane.add(new Label("Enter ISBN:"), 0, 2);
        pane.add(new TextField(), 1, 2);
        pane.add(new Label("Enter Price:"), 0, 3);
        pane.add(new TextField(), 1,3);
        pane.add(new Label("Enter Image Name (including extension)"), 0,4);
        pane.add(new TextField(), 1,4);
        Button btAdd = new Button("Search!");
        pane.add(btAdd, 1, 6);
        GridPane.setHalignment(btAdd, HPos.RIGHT);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Book Information Entry"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}