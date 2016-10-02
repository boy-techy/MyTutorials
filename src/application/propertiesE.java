package application;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class propertiesE extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
		primaryStage.setTitle("Properties Example");
		
		Person Rahul=new Person();
		Rahul.firstnameProperty().addListener((v,oldValue,newValue)->{
			System.out.println(newValue);
			System.out.println("firstnameProperty: "+Rahul.firstnameProperty());
			System.out.println("getFirstName() "+Rahul.getFirstname());
		});
		
		TextField textField=new TextField();
		textField.setPromptText("New Value");
		
		Button button =new Button("Change");
		button.setOnAction(e->{
			Rahul.setFirstname(textField.getText());
		});
		
		HBox hbox=new HBox(10);
		hbox.getChildren().addAll(textField,button);
		Scene scene=new Scene(hbox,300,200);
		
		primaryStage.setScene(scene);
		
		//Property BINDING
		IntegerProperty x=new SimpleIntegerProperty(3);
		IntegerProperty y=new SimpleIntegerProperty();
		
		y.bind(x.multiply(10));
		
		System.out.println("X: "+x.getValue());
		System.out.println("Y: "+y.getValue());
		
		x.setValue(2);
		System.out.println("X: "+x.getValue());
		System.out.println("Y: "+y.getValue());
		
	}

	public static void main(String[] args) {
		launch(args);

	}

}
