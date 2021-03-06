package projekt;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * The final alert that let's the user know they have mastered the game
 * 
 * @author Heidi Koppel
 *
 */
public class GameOverAlert {
	/**
	 * This method creates the alert and displays it to the user
	 */
	public static void display() {

		Stage window = new Stage();
		window.setMinWidth(250);

		// Blocks user interaction with other windows while this alert box is
		// open
		window.initModality(Modality.APPLICATION_MODAL);

		// Sets title of window
		window.setTitle("Oled jõudnud mängu lõppu");

		// Creates a label to display a congratulatory message.
		Label infoLabel = new Label();
		infoLabel.getStyleClass().add("label-evaluation");
		infoLabel.setText("Palju õnne! Oskad nüüd kõiki valemeid");

		// Displays an image in the alert.
		Image chuck = new Image("Cats/Chuck.jpg");
		ImageView iv = new ImageView();
		iv.setImage(chuck);

		// Creates a button to close the whole program
		Button button = new Button("Head aega");
		button.setOnAction(e -> {
			window.close();
			Main.window.close();
		});

		// Sets the layout of the alert
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(10));
		layout.getChildren().addAll(infoLabel, iv, button);
		layout.setAlignment(Pos.CENTER);

		// Starts the alert scene
		Scene scene = new Scene(layout);
		scene.getStylesheets().add("file:///Users/heidikoppel/Documents/GitHub/Project/projekt/Form.css");
		window.setScene(scene);
		window.showAndWait();
	}
}
