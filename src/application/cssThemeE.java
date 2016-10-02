package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class cssThemeE extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
		primaryStage.setTitle("CSS Example");
		
		Label nameL=new Label("UserName: ");
		nameL.setId("bold-label");
		//nameL.setStyle("-fx-text-fill: #e8e8e8");
		GridPane.setConstraints(nameL,0,0);
		TextField uText=new TextField();
		GridPane.setConstraints(uText, 1, 0);
		uText.setPromptText("Username");
		
		Label pwdL=new Label("Password: ");
		//pwdL.setStyle("-fx-text-fill: #e8e8e8");
		GridPane.setConstraints(pwdL, 0, 1);
		TextField pwdText=new TextField();
		pwdText.setPromptText("Password");
		GridPane.setConstraints(pwdText, 1, 1);
		
		Button login=new Button("Login");
		login.setOnAction(e->{
			
			System.out.println("Successfully has Been Submitted");
			setUserAgentStylesheet(STYLESHEET_CASPIAN);
		});
		GridPane.setConstraints(login, 1, 3);
		
		Button cancel=new Button("Cancel");
		cancel.getStyleClass().add("button-blue");
		GridPane.setConstraints(cancel, 0, 3);
		
		
		
		GridPane layout=new GridPane();
		layout.setPadding(new Insets(10, 10, 10, 10));
		layout.setVgap(10);
		layout.setHgap(10);
		layout.getChildren().addAll(nameL,uText,pwdL,pwdText,login,cancel);
		Scene scene=new Scene(layout,300,300);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);

	}

	public static void main(String[] args) {
		launch(args);

	}

}
