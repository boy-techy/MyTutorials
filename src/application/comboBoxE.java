package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class comboBoxE extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("ComBoBox");
		primaryStage.show();
		
		Button button =new Button("Submit");
		ComboBox<String> combobox=new ComboBox<>();
		combobox.getItems().addAll("Free Ki Ali","Pink");
		combobox.setPromptText("Select Favorite Movie: ");
		
		combobox.setEditable(true);
		
		combobox.setOnAction(e->{
			System.out.println(combobox.getValue());
		});
		
		button.setOnAction(e->printMovie(combobox));
		
		VBox vbox=new VBox(10);
		vbox.setPadding(new Insets(100, 100, 100, 100));
		vbox.getChildren().addAll(combobox,button);
		
		Scene scene=new Scene(vbox,300,300);
		primaryStage.setScene(scene);

	}

	public static void main(String[] args) {
		launch(args);

	}
	private void printMovie(ComboBox<String> combox){
		System.out.println(combox.getValue());
	}

}
