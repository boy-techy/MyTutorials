package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class gridPaneE extends Application{	

	public static void main(String[] args) {
		launch(args);

	}
	@Override
	public void start(Stage primaryStage) throws Exception {
			primaryStage.setTitle("GridPane");
			
			GridPane grid=new GridPane();
			grid.setPadding(new Insets(10,10,10,10));
			grid.setVgap(10);
			grid.setHgap(10);
			
			//name Label
			Label namelabel=new Label("UserName:");
			GridPane.setConstraints(namelabel, 0, 0);
			
			//TextBox
			TextField nameText=new TextField();
			nameText.setPromptText("UserName");
			GridPane.setConstraints(nameText, 1, 0);
			
			//Password Label
			Label pwdlabel=new Label("Password:");
			GridPane.setConstraints(pwdlabel, 0, 1);
			
			//TextBox
			TextField pwdText=new TextField();
			pwdText.setPromptText("Password");
			GridPane.setConstraints(pwdText, 1, 1);
			
			//Login Button
			Button login=new Button("Login");
			GridPane.setConstraints(login, 1, 2);
			login.setOnAction(e->{
				String name=null,pwd=null;
				name=nameText.getText();
				pwd=pwdText.getText();
				System.out.println(pwd);
				if(name.equals("") || pwd.equals("")){
					CustomAlertBox.display("Warning", "Username/Password is Wrong");
					
				}
				else
					CustomAlertBox.display("Welcome", "Hey "+name+ " Welcome in New World");
			});
			grid.getChildren().addAll(namelabel,nameText,pwdlabel,pwdText,login);
			
			Scene scene=new Scene(grid,400,300);
			primaryStage.setScene(scene);
			primaryStage.show();
	}

}
