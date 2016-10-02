package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PropertiesExample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
		primaryStage.setTitle("Example Of Properties");
		
		TextField textField=new TextField();
		textField.setMaxWidth(200);
		
		Label l1=new Label("Your's Welcome ");
		Label l2=new Label();
		
		l2.textProperty().bind(textField.textProperty());
		
		HBox hbox=new HBox(l1,l2);
		hbox.setAlignment(Pos.CENTER);
		
		VBox vbox=new VBox(10,textField,hbox);
		vbox.setAlignment(Pos.CENTER);
		Scene scene=new Scene(vbox,300,200);
		primaryStage.setScene(scene);

	}

	public static void main(String[] args) {
		launch(args);

	}

}
