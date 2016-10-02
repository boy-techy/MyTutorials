package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class treeViewE extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
		primaryStage.setTitle("TreeView Example");
		
		TreeView<String> tree;
		TreeItem<String> root,abc,cde;
		
		//Root
		root=new TreeItem<>();
		root.setExpanded(true);
		
		//abc
		abc=makeBranch("ABC",root);
		makeBranch("BVS",abc);
		makeBranch("BVSD",abc);
		makeBranch("JGSD",abc);
		
		//cde
		cde=makeBranch("CDE",root);
		makeBranch("CND",cde);
		makeBranch("ChjG",cde);
		
				
		tree=new TreeView<String>(root);
		tree.setShowRoot(false);
		
		//Listener to TreeView
		tree.getSelectionModel().selectedItemProperty().addListener((v,oldValue,newValue)->{
			if(newValue!=null)
			System.out.println(newValue.getValue());
		});
		
		StackPane layout=new StackPane();
		layout.getChildren().add(tree);
		
		Scene scene=new Scene(layout,200,200);
		primaryStage.setScene(scene);
		
		
	}
	
	public TreeItem<String> makeBranch(String title,TreeItem<String> parent){
		
		TreeItem<String> item=new TreeItem<>(title);
		item.setExpanded(true);
		parent.getChildren().add(item);
		return item;
		
	}
	

	public static void main(String[] args) {
		launch(args);

	}

}
