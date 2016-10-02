package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class checkBoxE extends	Application{

	
	public static void main(String[] args) {
		launch(args);

	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
		primaryStage.setTitle("Controls Example");
		
		CheckBox box1=new CheckBox("Check1");
		CheckBox box2=new CheckBox("Check2");
		box2.setSelected(true);
		
		CheckBox box3=new CheckBox("Check3");
		
		Button b1=new Button("Check ANswer");
		b1.setOnAction(e->handleOptions(box1,box2,box3));
		
		VBox vbox=new VBox(10);
		vbox.setPadding(new Insets(10));
		vbox.getChildren().addAll(box1,box2,box3,b1);
		
		Scene scene=new Scene(vbox,300,300);
		primaryStage.setScene(scene);
		
		
	}
	private void handleOptions(CheckBox box1,CheckBox box2,CheckBox box3){
		String message="User Selections: " ;
		
		if(box1.isSelected())
			message+="Box1";
		if(box2.isSelected())
			message+="Box2";
		if(box3.isSelected())
			message+="Box3";
		
		System.out.println(message);
	}

}
