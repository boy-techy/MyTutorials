package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class layoutsE  extends Application {

	public static void main(String[] args) {
		launch(args);

	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox leftPane=new VBox();
		Button b1=new Button("Button1");
		Button b2=new Button("Button2");
		Button b3=new Button("Button3");
		Button b4=new Button("Button4");
		leftPane.getChildren().addAll(b1,b2,b3,b4);
		
		
		HBox topPane=new HBox();
		Button button1=new Button("ButtonA");
		Button button2=new Button("ButtonB");
		Button button3=new Button("ButtonC");
		Button button4=new Button("ButtonD");
		topPane.getChildren().addAll(button1,button2,button3,button4);
		
		
		
		BorderPane border=new BorderPane();
		border.setTop(topPane);
		border.setLeft(leftPane);
		Scene scene=new Scene(border,300,200);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
