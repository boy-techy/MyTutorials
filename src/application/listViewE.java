package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class listViewE extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
		primaryStage.setTitle("List VIew Example");
		
		Button button=new Button("Submit");
		
		
		ListView<String> listview=new ListView<>();
		listview.getItems().addAll("Iron Man","Expandable","Captain America");
		
		//For Multiple Itmes
		listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		button.setOnAction(e->printListItem(listview));
		
		VBox layout=new VBox(10);
		layout.setPadding(new Insets(100, 100, 100, 100));
		layout.getChildren().addAll(listview,button);
		
		Scene scene=new Scene(layout,300,300);
		primaryStage.setScene(scene);
	}

	public static void main(String[] args) {
		launch(args);

	}
	private void printListItem(ListView<String> list){
		String message="";
		ObservableList<String> movies;
		movies=list.getSelectionModel().getSelectedItems();
		
		for(String s:movies){
			message+=s;
		}
		System.out.println(message);
	}
}
