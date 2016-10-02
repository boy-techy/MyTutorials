package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class menusE extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
		primaryStage.setTitle("Menu Example");
		
		//FileMenu
		Menu fileMenu=new Menu("_File");
		
		//fileMenu Items
		MenuItem newFile=new MenuItem("New File...");
		newFile.setOnAction(e->System.out.println("Create a New File "));
		
		fileMenu.getItems().add(newFile);
		fileMenu.getItems().add(new MenuItem("New Project..."));
		fileMenu.getItems().add(new MenuItem("Open File..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Save As..."));
		fileMenu.getItems().add(new MenuItem("Exit..."));
		
		
		//Edit Menu
		Menu editMenu=new Menu("_Edit");
		
		//EditMenu Item
		editMenu.getItems().add(new MenuItem("Cut"));
		editMenu.getItems().add(new MenuItem("Copy"));
		editMenu.getItems().add(new MenuItem("Paste"));
		
		//Check MenuItem
		Menu helpMenu=new Menu("_Help");
		
		CheckMenuItem showline=new CheckMenuItem("Show Line Numbers ");
		showline.setOnAction(e->{
			if(showline.isSelected())
				System.out.println("Line Number WIll Displayed");
		});
		helpMenu.getItems().add(showline);
		
		//RadioMenuItem
		Menu radioMenu=new Menu("Radio Menu");
		ToggleGroup difficulty=new ToggleGroup();
		
		RadioMenuItem easy=new RadioMenuItem("Easy");
		RadioMenuItem med=new RadioMenuItem("Medium");
		RadioMenuItem hard=new RadioMenuItem("Hard");
		
		easy.setToggleGroup(difficulty);
		med.setToggleGroup(difficulty);
		hard.setToggleGroup(difficulty);
		
		radioMenu.getItems().addAll(easy,med,hard);
		
		//Main Menu Bar
		MenuBar menuBar=new MenuBar();
		menuBar.getMenus().addAll(fileMenu,editMenu,helpMenu,radioMenu);
		
		BorderPane layout=new BorderPane();
		layout.setTop(menuBar);
		
		Scene scene=new Scene(layout,300,300);
		primaryStage.setScene(scene);

	}

	public static void main(String[] args) {
		launch(args);

	}

}
