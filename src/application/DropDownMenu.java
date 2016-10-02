package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DropDownMenu extends Application {

	public static void main(String[] args) {
		launch(args);

	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
		primaryStage.setTitle("DropDown Menu");
		Button button=new Button("Click Here");
		
		ChoiceBox<String> choiceBox=new ChoiceBox<>();
		
		//getItems returns the Observablelist Object which you can add item to
		choiceBox.getItems().add("Apples");
		choiceBox.getItems().add("Banana");
		choiceBox.getItems().add("Grapes");
		choiceBox.getItems().addAll("Bacon","Mango","Orange");
		
		//Set Default Value
		choiceBox.setValue("Grapes");
		
		choiceBox.getSelectionModel().selectedItemProperty().addListener((v,oldvalue,newvalue)->{
			System.out.println(newvalue);
		});
		
		
		
		button.setOnAction(e->getChoice(choiceBox));
		
		VBox layout=new VBox(10);
		layout.setPadding(new Insets(100, 100, 100,100));
		layout.getChildren().addAll(choiceBox,button);
		Scene scene=new Scene(layout,300,300);
		primaryStage.setScene(scene);
		
	}
	private void getChoice(ChoiceBox<String> choiceBox){
		String food=choiceBox.getValue();
		System.out.println(food);
	}

}
