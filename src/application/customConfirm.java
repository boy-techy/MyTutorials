package application;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class customConfirm {

	static boolean reply;

	public static boolean display(String title, String msg) {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.show();
		Label l = new Label(msg);

		TextArea text = new TextArea();
		Button confirm = new Button("Confirm");
		Button cancel = new Button("Cance");
		confirm.setOnAction(e ->{
			reply=true;
			window.close();
		});
		cancel.setOnAction(e ->{
			reply=false;
			window.close();
		});
		VBox vbox=new VBox();
		vbox.getChildren().addAll(l,text,confirm,cancel);
		Scene scene=new Scene(vbox,200,200);
		
		window.setScene(scene);
		return reply;

	}

}
