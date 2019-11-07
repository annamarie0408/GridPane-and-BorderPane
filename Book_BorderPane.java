import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;


public class Book_BorderPane extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

        String isbn = "0987434567";
        double price = 24.99;

        // Create a border pane
        BorderPane pane = new BorderPane();

        // Place nodes in the pane
        pane.setTop(new CustomPane("Introduction to Java Programming"));
        pane.setBottom(new CustomPane("ISBN: " +isbn + "\t\tPrice:" + price));
        ImageView imgpic=new ImageView(new Image("JavaBOok.jpg")); //100, 100, false, false));

        pane.setCenter(imgpic);


        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Book Information"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}

// Define a custom pane to hold a label in the center of the pane
class CustomPane extends StackPane {
    public CustomPane(String title) {
        getChildren().add(new Label(title));
        setStyle("-fx-border-color: blue");
        setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    }
}

