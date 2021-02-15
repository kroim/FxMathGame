/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgameprofx;

import com.sun.javafx.collections.ElementObservableListDecorator;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.ListBinding;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author top1st
 */
public class RecordAnswers extends Application {
    
    private TableView tableView = new TableView();
    private final ObservableList<ScoreRecordTable> data = FXCollections.observableArrayList();
//    private final ObservableList<Person> data =
//        FXCollections.observableArrayList(
//            new Person("Jacob", "Smith", "jacob.smith@example.com"),
//            new Person("Isabella", "Johnson", "isabella.johnson@example.com"),
//            new Person("Ethan", "Williams", "ethan.williams@example.com"),
//            new Person("Emma", "Jones", "emma.jones@example.com"),
//            new Person("Michael", "Brown", "michael.brown@example.com")
//        );
    final Label label = new Label("SYSTEM RECORDS THE ANSWERS");
    final VBox vbox = new VBox();
    public RecordAnswers() {
        TableColumn symbolNameColumn = new TableColumn("SYMBOL");
        TableColumn correctNumColumn = new TableColumn("PROBLEMS CORRECT");
        TableColumn skillColumn = new TableColumn("SKILLS");
        tableView.setEditable(true);
        
        for(int i = 0; i < 5; i++){
            data.add(new ScoreRecordTable(GameData.getInstance().symbolnames[i], Integer.toString(GameData.getInstance().recordSet[i]), "Multiply Fractions"));
        }
        symbolNameColumn.setMinWidth(30);
        symbolNameColumn.setCellValueFactory(new PropertyValueFactory<ScoreRecordTable, String>("symbolName"));
        correctNumColumn.setMinWidth(10);
        correctNumColumn.setCellValueFactory(new PropertyValueFactory<ScoreRecordTable, String>("correctNum"));
        skillColumn.setMaxWidth(100);
        skillColumn.setCellValueFactory(new PropertyValueFactory<ScoreRecordTable, String>("skillName"));
        
//        TableColumn firstNameCol = new TableColumn("First Name");
//        TableColumn lastNameCol = new TableColumn("Last Name");
//        TableColumn emailCol = new TableColumn("Email");
        
//        firstNameCol.setCellValueFactory(
//        new PropertyValueFactory<Person,String>("firstName")
//        );
//        lastNameCol.setCellValueFactory(
//            new PropertyValueFactory<Person,String>("lastName")
//        );
//        emailCol.setCellValueFactory(
//            new PropertyValueFactory<Person,String>("email")
//        );

        tableView.setItems(data);
        
//        tableView.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
        tableView.getColumns().addAll(symbolNameColumn, correctNumColumn, skillColumn);
        
        
        
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(label, tableView);
//        tableView.setFixedCellSize(25);
//        tableView.prefHeightProperty().bind(tableView.fixedCellSizeProperty().multiply(Bindings.size(tableView.getItems()).add(1.01)));
//        tableView.minHeightProperty().bind(tableView.prefHeightProperty());
//        tableView.maxHeightProperty().bind(tableView.prefHeightProperty());
    }
    

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Record Answers");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Record Answers");
                MathGameProFx mathGameProFx = new MathGameProFx();
                mathGameProFx.start(primaryStage);
            }
        });
        vbox.getChildren().add(btn);
        StackPane root = new StackPane();
        root.getChildren().addAll(vbox);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Record Answers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static class ScoreRecordTable {
    private final SimpleStringProperty symbolName;
    private final SimpleStringProperty correctNum;
    private final SimpleStringProperty skillName;

    public ScoreRecordTable(String symbolName, String correctNum, String skillName) {
        this.symbolName = new SimpleStringProperty(symbolName);
        this.correctNum = new SimpleStringProperty(correctNum);
        this.skillName = new SimpleStringProperty(skillName);
    }
    
    public String getSymbolName() {
            return symbolName.get();
        }
 
        public void setSymbolName(String fName) {
            this.symbolName.set(fName);
        }
 
        public String getCorrectNum() {
            return correctNum.get();
        }
 
        public void setCorrectNum(String fName) {
            this.correctNum.set(fName);
        }
 
        public String getSkillName() {
            return skillName.get();
        }
 
        public void setSkillName(String fName) {
            this.skillName.set(fName);
        }
    }
    
    
    public static class Person {
 
        private final SimpleStringProperty firstName;
        private final SimpleStringProperty lastName;
        private final SimpleStringProperty email;
 
        private Person(String fName, String lName, String email) {
            this.firstName = new SimpleStringProperty(fName);
            this.lastName = new SimpleStringProperty(lName);
            this.email = new SimpleStringProperty(email);
        }
 
        public String getFirstName() {
            return firstName.get();
        }
 
        public void setFirstName(String fName) {
            firstName.set(fName);
        }
 
        public String getLastName() {
            return lastName.get();
        }
 
        public void setLastName(String fName) {
            lastName.set(fName);
        }
 
        public String getEmail() {
            return email.get();
        }
 
        public void setEmail(String fName) {
            email.set(fName);
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
