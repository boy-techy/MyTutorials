package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class t2 extends Application implements EventHandler<ActionEvent>{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane bp=new StackPane();
		Button b=new Button();
		b.setText("Click");
		b.setOnAction(this);
		bp.getChildren().add(b);
		
		Scene scene=new Scene(bp,400,300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	public void handle(ActionEvent event) {
		System.out.println("Clicked");
	};
}
