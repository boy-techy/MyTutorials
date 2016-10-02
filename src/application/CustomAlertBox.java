package application;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CustomAlertBox {

	public static void display(String title,String msg){
		Stage stage=new Stage();
		
		stage.initModality(Modality.APPLICATION_MODAL);//Forcefully on Parent Window
		stage.setWidth(300);
		stage.setTitle(title);
		
		
		Label label=new Label();
		label.setText(msg);
		Button closeButton=new Button("Close");
		closeButton.setOnAction(e->stage.close());
		
		VBox vbox=new VBox();
		vbox.getChildren().addAll(label,closeButton);
		vbox.setAlignment(Pos.CENTER);
		
		Scene scene=new Scene(vbox,200,200);
		stage.setScene(scene);
		stage.show();
	}
}
