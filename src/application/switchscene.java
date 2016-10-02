package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class switchscene extends Application {
	
	Stage window;
	Scene scene1,scene2;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window =primaryStage;
		
		VBox pane=new VBox();
		Button next=new Button();
		Button al=new Button("AlertBox");//Display Alert Box
		al.setOnAction(e->CustomAlertBox.display("AlertBox", "Click And Close"));
		//pane.setPadding(new Insets(10, 10, 10, 10));
		pane.getChildren().addAll(next,al);
		next.setText("Next Scene");
		next.setOnAction(e->window.setScene(scene2));
		scene1=new Scene(pane,400,300);
		
		//Confirm Box
		Button confButton =new Button("ConfirmBox");
		confButton.setOnAction(e->{
			boolean answer=customConfirm.display("ConfirmBox", "Are You Sure");
			System.out.println(answer);
		});
		pane.getChildren().add(confButton);
		
		//Close Function Of Window
		Button close=new Button("Exit");
		close.setOnAction(e->closeFunction());
		window.setOnCloseRequest(e->{
			e.consume();
			closeFunction();
		});
		pane.getChildren().add(close);
		
		StackPane st=new StackPane();
		Button previous=new Button("Previous");
		previous.setOnAction(e->window.setScene(scene1));
		st.getChildren().add(previous);
		scene2=new Scene(st,400,300);
		
		window.setScene(scene1);
		window.show();
		
	}
	private void closeFunction(){
		boolean answer=customConfirm.display("Confirm", "Are you Sure");
		if(answer)
			window.close();
	}

}
