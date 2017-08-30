package ex5;/**
 * Created by jonathanhector on 06.12.16.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class ButtonViewer extends Application {

	public void start(Stage primaryStage) {

		Button buttonA = new Button("Button A");
		Button buttonB = new Button("Button B");
		Button buttonC = new Button("Button C");

		HBox pane = new HBox(5, buttonA, buttonB, buttonC);
		pane.setAlignment(Pos.CENTER);

		//get the source of the button and reads the text of the button with Date and Time
		EventHandler<ActionEvent> handler =
				e -> System.out.println(((Button)e.getSource()).getText()
				 + " was clicked on "+ LocalDate.now() + " at " + LocalTime.now());
                
                buttonA.setOnAction(handler);
                buttonB.setOnAction(handler);
                buttonC.setOnAction(handler);
                

		Scene scene = new Scene(pane, 300, 60);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
