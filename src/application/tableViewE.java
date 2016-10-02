package application;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class tableViewE extends Application {

	Stage window;
	TableView<product> productTable;
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
		primaryStage.setTitle("Product Table Example");
		
		productTable=new TableView<>();
		
		TableColumn<product, String> nameColumn=new TableColumn<>("Name");
		nameColumn.setMinWidth(20);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		TableColumn<product, Double> priceColumn=new TableColumn<>("Price");
		priceColumn.setMinWidth(20);
		priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
		
		
		TableColumn<product, Integer> quantColumn=new TableColumn<>("Quantity");
		quantColumn.setMinWidth(20);
		quantColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
		
		//Load Item in Table
		productTable.setItems(getProduct());
		productTable.getColumns().addAll(nameColumn,priceColumn,quantColumn);
		
		
		//Editable Table
		TextField nameInput=new TextField();
		nameInput.setPromptText("Name");
		nameInput.setMinWidth(10);
		
		TextField priceInput=new TextField();
		priceInput.setPromptText("Price");
		
		TextField quantInput=new TextField();
		quantInput.setPromptText("Quantity");
		
		Button addButton=new Button("Add");
		addButton.setMinWidth(55);
		addButton.setOnAction(e->addProduct(nameInput,priceInput,quantInput));
		
		Button delButton =new Button("Delete");
		delButton.setMinWidth(67);
		delButton.setOnAction(e->deleteProduct(nameInput,priceInput,quantInput));
		
		HBox hbox=new HBox();
		hbox.setPadding(new Insets(10, 10, 10, 10));
		hbox.setSpacing(5);
		hbox.getChildren().addAll(nameInput,priceInput,quantInput,addButton,delButton);
		
		VBox vbox=new VBox(10);
		vbox.getChildren().addAll(productTable,hbox);
		Scene scene=new Scene(vbox,400,400);
		primaryStage.setScene(scene);

	}

	public ObservableList<product> getProduct(){
		
		ObservableList<product> products=FXCollections.observableArrayList();
		products.add(new product("Laptop",869.98,10));
		products.add(new product("Desktop",89.09,12));
		products.add(new product("Gadgets",8912.09,123));
		products.add(new product("Mobile",8922.09,121));
		products.add(new product("Screen Devices",8932.09,112));
		
		return products;
	}
	
	public void addProduct(TextField name,TextField value,TextField qunatity){
		
		product pro=new product();
		pro.setName(name.getText());
		pro.setPrice(Double.parseDouble(value.getText()));
		pro.setQuantity(Integer.parseInt(qunatity.getText()));
		productTable.getItems().add(pro);
		name.clear();
		value.clear();
		qunatity.clear();
		
	}
	public void deleteProduct(TextField name,TextField value,TextField qunatity){
		
		ObservableList<product> productSelected,allProduct;
		allProduct=productTable.getItems();
		productSelected=productTable.getSelectionModel().getSelectedItems();
		
		productSelected.forEach(allProduct::remove);
	}
	
	
	public static void main(String[] args) {
		launch(args);

	}

}
