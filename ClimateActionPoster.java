import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ClimateActionPoster extends Application {

    @Override
    public void start(Stage stage) {

        // Title
        Label title = new Label("🌍 CLIMATE ACTION");
        title.setFont(Font.font("Arial", 32));
        title.setTextFill(Color.DARKGREEN);

        Label sdg = new Label("SDG 13 - TAKE URGENT ACTION TO COMBAT CLIMATE CHANGE");
        sdg.setFont(Font.font("Arial", 16));

        // Main message
        Label message = new Label(
                "Protect our planet today for a better tomorrow!\n\n"
                + "✓ Plant more trees\n"
                + "✓ Save electricity\n"
                + "✓ Reduce plastic waste\n"
                + "✓ Use public transport\n"
                + "✓ Keep our environment clean"
        );

        message.setFont(Font.font("Arial", 18));
        message.setTextFill(Color.DARKBLUE);

        // Text field
        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name");

        // Button
        Button button = new Button("TAKE THE PLEDGE");

        Label result = new Label();

        button.setOnAction(e -> {
            String name = nameField.getText();

            if (name.isEmpty()) {
                result.setText("Please enter your name!");
            } else {
                result.setText(
                        "Thank you " + name
                        + "! You pledged to protect the planet 🌱"
                );
            }
        });

        // Layout
        VBox layout = new VBox(15);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new javafx.geometry.Insets(30));
        layout.setBackground(
                new Background(new BackgroundFill(
                        Color.LIGHTGREEN,
                        CornerRadii.EMPTY,
                        javafx.geometry.Insets.EMPTY
                ))
        );

        layout.getChildren().addAll(
                title,
                sdg,
                message,
                nameField,
                button,
                result
        );

        // Scene
        Scene scene = new Scene(layout, 700, 600);

        stage.setTitle("SDG 13 - Climate Action");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
